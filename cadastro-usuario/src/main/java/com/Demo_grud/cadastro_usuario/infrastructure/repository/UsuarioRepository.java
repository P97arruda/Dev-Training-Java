package com.Demo_grud.cadastro_usuario.infrastructure.repository;

import com.Demo_grud.cadastro_usuario.infrastructure.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> finByEmail(String email);

    @Transactional
    void deletByEmail(String email);
}
