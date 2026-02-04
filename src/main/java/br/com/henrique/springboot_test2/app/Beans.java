package br.com.henrique.springboot_test2.app;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration // adicionando Configuration para garantir que as injeções não deem erro, em algumas versões do spring isso pode ocorrer, como foi o meu caso.
public class Beans { // criando uma classe onde será armazenado todos os Beans, para não poluir as outras classes e deixar o código mais organizado.

    @Bean // usamos Bean quando não temos o acesso ao código fonte da classe que queremos usar.
    public Gson gson() { // precisamos criar uma estrutura onde o gson vai ser Bean, pois a classe Gson que é do google (ela é externa), não tem o Component implementado nela.
        return new Gson();
    }
}
