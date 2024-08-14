package com.epifanio.aplicacao_web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epifanio.aplicacao_web.model.Usuario; 
import com.epifanio.aplicacao_web.repositories.ProjetowebRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class UsuarioSpotController {
    
    @Autowired
    ProjetowebRepository projetowebRepository;
    
    @GetMapping("usuario")
    public List<Usuario> listaProdutos(){
        return projetowebRepository.findAll();
    }
    
    @GetMapping("/usuario/{id}")
    public Usuario listaUsuarioUnico(@PathVariable(value = "id") long id){
        return projetowebRepository.findById(id);
    }

    @PostMapping("/usuario") //Esse Request body é aquele que aparece no html!
    public Usuario enviaUsuario(@RequestBody Usuario usuario) {
        return projetowebRepository.save(usuario);
    }

    @DeleteMapping("/usuario")
    public void deletaUsuario(@RequestBody Usuario usuario) {
        projetowebRepository.delete(usuario);
    }
    

    @PutMapping("/usuario")
    public Usuario atualizaUsuario(@RequestBody Usuario usuario) {
        return projetowebRepository.save(usuario);
    }
    
}

