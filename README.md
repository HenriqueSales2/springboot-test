springboot-test

Projeto de exemplo para criação e execução de testes automatizados utilizando Spring Boot e JUnit.

Sumário

Pré-requisitos

Instalação das dependências

Estrutura do Projeto

Executando a Aplicação

Executando os Testes

Pré-requisitos

Para executar este projeto, é necessário ter instalado na máquina:

Git

Java (JDK 17 ou compatível)

Maven (ou utilizar o Maven Wrapper que já vem no projeto)

Instalação das dependências

Todas as dependências do projeto já estão configuradas no arquivo pom.xml.

Após clonar o repositório, o Maven irá baixar automaticamente tudo o que for necessário.

git clone https://github.com/HenriqueSales2/springboot-test.git
cd springboot-test

Estrutura do Projeto

A estrutura do projeto segue o padrão do Spring Boot:

springboot-test/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── ...            # Código principal da aplicação
│   └── test/
│       └── java/
│           └── ...            # Testes automatizados
├── .mvn/                      # Configurações do Maven Wrapper
├── mvnw
├── mvnw.cmd
├── pom.xml                    # Dependências e configurações do projeto
├── README.md
└── HELP.md


src/main/java: contém o código principal da aplicação.

src/test/java: contém os testes automatizados feitos com JUnit e Spring Boot Test.

pom.xml: arquivo responsável pelas dependências, versões e plugins do projeto.

Executando a Aplicação

Para subir a aplicação Spring Boot, execute o comando abaixo na raiz do projeto:

./mvnw spring-boot:run


No Windows, use:

mvnw.cmd spring-boot:run

Executando os Testes

Para executar os testes automatizados, utilize:

./mvnw test


Esse comando irá:

Compilar o projeto

Executar todos os testes presentes em src/test/java

Exibir no terminal se os testes passaram ou falharam
