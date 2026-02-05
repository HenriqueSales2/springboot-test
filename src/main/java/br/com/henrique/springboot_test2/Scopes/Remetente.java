package br.com.henrique.springboot_test2.Scopes;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data // usando o Data para não precisar ficar codando Getters, Setters, Constructors,etc...
@Component
public class Remetente {
    private String nome;
    private String email;
}
