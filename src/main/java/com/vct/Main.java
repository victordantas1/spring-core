package com.vct.entities;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigBeans.class);
        Pessoa p1 = context.getBean(Pessoa.class);
        System.out.println("Nome: " + p1.getNome() + " " + p1.getSobrenome());
        System.out.println("Email: " + p1.getEmail());
        System.out.println("Endereco: " + p1.getEndereco().getRua() + ", " + p1.getEndereco().getBairro());
        System.out.println("Cachorros: ");
        p1.getCachorros().forEach(cachorro -> System.out.println("Nome: "+ cachorro.getNome() + " | Raca: " + cachorro.getRaca()
                + " | Dono: " + cachorro.getDono().getNome()));
    }

}
