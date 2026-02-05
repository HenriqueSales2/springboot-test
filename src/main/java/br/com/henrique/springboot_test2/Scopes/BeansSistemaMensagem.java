package br.com.henrique.springboot_test2.Scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class BeansSistemaMensagem {

    @Bean
    @Scope("prototype") // agora com essa função do Spring, consigo criar dois objetos diferentes
    public Remetente remetente() { // aqui eu criei o remetente, porém ele só cria um objeto, e na hora da chamada do Main através do SistemaMensagem ele muda com a variável noreply e techTeam, mas com o Scope o jogo muda
        System.out.println("CRIANDO UM OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setEmail("remetente@remetente.com");
        remetente.setNome("Remente teste");
        return remetente;
    }


}
