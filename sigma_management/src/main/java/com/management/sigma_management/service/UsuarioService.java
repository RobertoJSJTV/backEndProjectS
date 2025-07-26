package com.management.sigma_management.service;


import com.management.sigma_management.model.Usuario;
import com.management.sigma_management.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    public Usuario findByIdOrThrowException(Integer id){

        return this.usuarioRepository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario não encontrado"));
    }

    public List<Usuario> findAll(){
        return this.usuarioRepository.findAll();
    }

    public Usuario save(Usuario usuario){
        return this.usuarioRepository.save(usuario);
    }

    public List <Usuario> findByEmail(String email){
        return this.usuarioRepository.findByEmail(email);
    }

    public void deleteById(Integer id) {
        this.findByIdOrThrowException(id);
        this.usuarioRepository.deleteById(id);
    }

    public Usuario update(Usuario usuario) {
        Integer id = usuario.getId();
        this.findByIdOrThrowException(id);

        return this.usuarioRepository.save(usuario);
    }
}
