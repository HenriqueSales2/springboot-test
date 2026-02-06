package br.com.henrique.springboot_test2.PropertiesValues;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component // esqueci de mencionar que o Component serve para chamar a classe para o Main, sem ele essa classe não roda no SpringbootTest2Application.
public class SistemaMensagemProperties implements CommandLineRunner {


    @Autowired // uma outra coisa também, com o Autowired eu não preciso instanciar, ou seja, colocar new RemetenteProperties();
    private RemetenteProperties remetenteProperties;

    /*@Value("${nome}") // usando essa função do Value, conseguimos puxar uma "variável" com um valor já pré-estabelecido que eu coloquei do nosso application.properties que está localizado na pasta resources(caso você queira procurar).
    private String nome;
    @Value("${emailerrado:valor-padrão}") // caso o nome da "variável" esteja errado(coloquei de propósito a fins didáticos), tem como colocar um valor padrão, eu coloquei "valor-padrão" mesmo ;-;
    private String email;
    @Value("${telefones}") // para que usar ArrayList né hahaha
    private List<Long> telefones;*/

    // o exemplo está comentado, pois eu vou colocar ele em outra classe, porém não vou apagar para ficar de exemplo ;)

    @Override
    public void run(String... args) throws Exception {
        System.out.printf("Mensagem Enviada por: %s\nE-mail: %s\nTelefones para contato: %s\n", remetenteProperties.getNome(), remetenteProperties.getEmail(), remetenteProperties.getTelefones());
        System.out.println("Seu cadastro foi aprovado!");
    }
}
