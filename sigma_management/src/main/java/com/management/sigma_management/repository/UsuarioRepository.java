package com.management.sigma_management.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioRepository {
    List<Usuario> FindByEmail(String Email);

}
