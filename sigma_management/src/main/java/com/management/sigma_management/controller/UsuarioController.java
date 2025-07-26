package com.management.sigma_management.controller;


import com.management.sigma_management.model.Usuario;
import com.management.sigma_management.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/find")
    public ResponseEntity<List<Usuario>> find() {

        return ResponseEntity.ok(usuarioService.findAll());
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<List<Usuario>> findByEmail(@PathVariable("email") String email){
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @GetMapping("find/{id}")
    public ResponseEntity<Usuario> find(@PathVariable("id") Integer id){
        return ResponseEntity.ok(usuarioService.findByIdOrThrowException(id));
    }

    @PostMapping("/save")
    public ResponseEntity<Usuario> saveAll(@RequestBody Usuario usuario){
        return  ResponseEntity.ok(usuarioService.save(usuario));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Integer id){
        this.usuarioService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Usuario> update(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.update(usuario));
    }
}
