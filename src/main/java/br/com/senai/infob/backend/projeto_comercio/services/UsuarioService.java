package br.com.senai.infob.backend.projeto_comercio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.senai.infob.backend.projeto_comercio.models.Usuario;
import br.com.senai.infob.backend.projeto_comercio.repositories.UsuarioRepository;

@Service 
public class UsuarioService {

    @Autowired 
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public boolean login(String email, String password) {
        Usuario usuario = usuarioRepository.findByEmail(email);
        if (email == usuario.getEmail() && password == usuario.getSenha()) {
            return true; 
        } 
        return false;
    }
}
