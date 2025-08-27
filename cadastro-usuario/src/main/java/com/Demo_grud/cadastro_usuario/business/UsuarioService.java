package com.Demo_grud.cadastro_usuario.business;

import com.Demo_grud.cadastro_usuario.infrastructure.entitys.Usuario;
import com.Demo_grud.cadastro_usuario.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service

public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void salvarUsuario(Usuario usuario ){
        repository.saveAndFlush(usuario);
    }

    public Usuario buscarUsuarioPorEmail(String email){
        return repository.finByEmail(email).orElseThrow( () -> new RuntimeException("Email não encontrado"));
    }

    public void deletarUsuarioPorEmail(String email){
        repository.deletByEmail(email);
    }




}
