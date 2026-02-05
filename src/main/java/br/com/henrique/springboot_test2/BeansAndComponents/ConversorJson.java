package br.com.henrique.springboot_test2.BeansAndComponents;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // explicando a grosso modo, serve para fazer a injeção de dependências entre classes.
public class ConversorJson {


    @Autowired // com esse método acima, consigo usar o Autowired no nosso código livremente usando a classe Gson sem comprometer a aplicação.
    private Gson gson;



    public ViaCepResponse converter(String json) {
        ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
        return response;
    }
}
