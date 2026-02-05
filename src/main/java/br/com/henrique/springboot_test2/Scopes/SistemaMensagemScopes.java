package br.com.henrique.springboot_test2.Scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagemScopes {

    @Autowired
    private Remetente noreply; // essas duas variaveis estão apontando para uma única referência que é o Remetente

    @Autowired
    private Remetente techTeam;

    public void enviarConfirmacaoCadastro() {
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado em nosso sistema!");
    }

    public void enviarMensagemBoasVindas() {
        techTeam.setEmail("henrique@henrique.com"); // mudei o email, agora esse email vai ficar até o final da aplicação
        System.out.println(techTeam);
        System.out.println("Bem-vindo à Tech Team");
    }
}
