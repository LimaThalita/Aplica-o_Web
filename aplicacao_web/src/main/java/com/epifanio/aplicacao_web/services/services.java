package com.epifanio.aplicacao_web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epifanio.aplicacao_web.repositories.ProjetowebRepository;

@Service
public class services {

    @Autowired ProjetowebRepository projetowebRepository;

    public services(ProjetowebRepository projetowebRepository) {
        this.projetowebRepository = projetowebRepository;
    }
}
