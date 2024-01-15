package com.vct.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBeans {

    @Bean
    public Endereco endereco() {
        return new Endereco("Rua Itaguaruna", "Taruma-Acu", "21");
    }

}
