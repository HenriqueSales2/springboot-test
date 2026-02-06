package br.com.henrique.springboot_test2.PropertiesValues;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "remetenteproperties")
public class RemetenteProperties {

    private String nome;
    private String email;
    private List<Long> telefones;

}
