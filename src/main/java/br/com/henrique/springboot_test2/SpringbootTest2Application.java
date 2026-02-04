package br.com.henrique.springboot_test2;

import br.com.henrique.springboot_test2.app.ConversorJson;
import br.com.henrique.springboot_test2.app.ViaCepResponse;
import com.google.gson.Gson;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootTest2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTest2Application.class, args); // colocando o sistema para rodar
	}

	@Bean
	public CommandLineRunner run(ConversorJson conversorJson) throws Exception { // método run permite que consiga implementar outros componentes
		return args -> {
			String json = "{\"cep\": \"00000-000\", \"logradouro\": \"Praça Teste\", \"localidade\": \"São Paulo\"}"; // simulando uma requisição HTTP
			ViaCepResponse response = conversorJson.converter(json);
			System.out.println("Dados do CEP: " + response);
		};
	}

}
