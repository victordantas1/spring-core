package com.vct.entities;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

public class Pessoa {

    @Value("${pessoa.nome}")
    private String nome;

    @Value("${pessoa.sobrenome}")
    private String sobrenome;

    @Value("${pessoa.email}")
    private String email;

    @Autowired
    @Qualifier("main")
    private Endereco endereco;

    @Autowired
    private List<Cachorro> cachorros;

    Log log = LogFactory.getLog(getClass());

    public Pessoa() {
    }

    public Pessoa(String nome, String sobrenome, String email, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Cachorro> getCachorros() {
        return cachorros;
    }

    public void setCachorros(List<Cachorro> cachorros) {
        this.cachorros = cachorros;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @PostConstruct
    public void postConstruct() {
        log.info("Pessoa CONSTRUIDA");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("Pessoa sera DESTRUIDA");
    }
}
