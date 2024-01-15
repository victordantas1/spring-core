package com.vct.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigBeans {

    @Bean
    public Endereco endereco1() {
        return new Endereco("Rua Itaguaruna", "Cidade Nova", "21");
    }

    @Bean
    @Primary
    public Endereco endereco2() {
        return new Endereco("Av. Peixe Cavalo", "Taruma-Acu", "260");
    }

    @Bean
    public Cachorro cachorro1() {
        Cachorro c1 = new Cachorro();
        c1.setNome("Nevinho");
        c1.setRaca("Lhasa Apso");
        return c1;
    }

    @Bean
    public Cachorro cachorro2() {
        Cachorro c1 = new Cachorro();
        c1.setNome("Luke");
        c1.setRaca("Beagle");
        return c1;
    }

    @Bean
    public Pessoa pessoa() {
        Pessoa p1 = new Pessoa();
        p1.setNome("Victor");
        p1.setSobrenome("Dantas");
        p1.setEmail("victor@gmail.com");
        return p1;
    }

}
