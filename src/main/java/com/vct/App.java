package com.vct;

import com.vct.entities.Pessoa;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
        Pessoa p1 = context.getBean(Pessoa.class);
        System.out.println(p1.getEmail());
        System.out.println(p1.getEndereco().getRua() + ", " + p1.getEndereco().getBairro());
        p1.getCachorros().forEach(cachorro -> System.out.println(cachorro.getNome()));
    }
}
