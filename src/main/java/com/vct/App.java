package com.vct;

import com.vct.entities.Endereco;
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
        Endereco end2 = context.getBean(Endereco.class);
        System.out.println("Nome: " + p1.getNome() + " " + p1.getSobrenome());
        System.out.println("Email: " + p1.getEmail());
        System.out.println("Endereco: " + p1.getEndereco().getRua() + ", " + p1.getEndereco().getBairro());
        System.out.println("Cachorros: ");
        p1.getCachorros().forEach(cachorro -> System.out.println("Nome: "+ cachorro.getNome() + " | Raca: " + cachorro.getRaca()
                                                                        + " | Dono: " + cachorro.getDono().getNome()));
    }
}
