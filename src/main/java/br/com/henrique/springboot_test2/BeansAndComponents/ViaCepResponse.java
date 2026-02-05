package br.com.henrique.springboot_test2.BeansAndComponents;

import lombok.Data;


@Data // Usei o Data para não precisar ficar criando Getters and Setters, Construtores, etc. Pois deixa o código mais limpo.
public class ViaCepResponse {

    private String cep;
    private String logradouro;
    private String localidade;
}
