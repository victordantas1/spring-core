package com.vct.entities;

public class Cachorro {

    private String nome;
    private String raca;
    private Pessoa dono;

    public Cachorro () {
    }

    public Cachorro(String nome, String raca, Pessoa dono) {
        this.nome = nome;
        this.raca = raca;
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
}
