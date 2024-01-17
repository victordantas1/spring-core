package com.vct.config;

import com.vct.entities.Cachorro;
import com.vct.entities.Endereco;
import com.vct.entities.Pessoa;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.vct")
@PropertySource("classpath:application.properties")
public class ConfigBeansAnnotation {

    @Bean(name = "main")
    public Endereco endereco1() {
        return new Endereco("Rua Itaguaruna", "Cidade Nova", "21");
    }

    @Bean
    @Primary // Caso haja ambiguidade define o principal
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

}
