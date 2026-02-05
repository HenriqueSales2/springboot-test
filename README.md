# springboot-test

Projeto de exemplo para criação e execução de testes automatizados utilizando **Spring Boot** e **JUnit**.

## Sumário
- Pré-requisitos
- Instalação das dependências
- Estrutura do Projeto
- Executando a Aplicação
- Executando os Testes

## Pré-requisitos

Para executar este projeto, é necessário ter instalado na máquina:

- Git
- Java (JDK 17 ou compatível)
- Maven (ou utilizar o Maven Wrapper que já vem no projeto)
- IDE de sua preferência (no meu caso é o Intellij Ultimate)

## Instalação das dependências

Todas as dependências do projeto já estão configuradas no arquivo `pom.xml`.

Para conseguir rodar o código também precisamos instalar uma lib do Google:  [Clique aqui](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.13.2)

Depois de instalar, vá em sua IDE com o projeto aberto e clique em "Project Structure" e depois em lib e adicione ela lá. 

Após clonar o repositório, o Maven irá baixar automaticamente tudo o que for necessário.


```plaintext
A estrutura do projeto segue o padrão do Spring Boot:

springboot-test/
├── src/
│   ├── main/
│   │   └── java/        # Código principal da aplicação
│   └── test/
│       └── java/        # Testes automatizados
├── .mvn/                # Configurações do Maven Wrapper
├── mvnw
├── mvnw.cmd
├── pom.xml              # Dependências e configurações do projeto
├── README.md
└── HELP.md
```

Depois de clonar o repositório é só executar na sua IDE que verá o código rodando, eu deixei algumas anotações para quem não souber JAVA, entender melhor o código e como cada parte dele funciona. ;)
