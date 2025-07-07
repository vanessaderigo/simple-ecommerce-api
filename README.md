# Projeto Simple Ecommerce API

API REST desenvolvida como parte do curso de Java do Professor Nélio Alves (Udemy). O projeto simula um sistema de gerenciamento de pedidos e usuários, com operações básicas de CRUD e relacionamentos entre entidades.

## Tecnologias Utilizadas

- Java 21  
- Spring Boot 3.5  
- Spring Web  
- Spring Data JPA  
- H2 Database (memória)  
- Lombok  
- Maven  

## Funcionalidades

- Cadastro e pesquisa de usuários  
- Registro de pedidos associados a usuários  
- Consulta de produtos e categorias  
- Relacionamentos entre entidades com JPA/Hibernate  
- Tratamento de exceções  

## Pré-requisitos

- JDK 21 ou superior  
- Maven 3.8+
- IDE com suporte a Java ou terminal (CMD, PowerShell, etc)  


## Como executar

1. Clone o repositório ou baixe o `.zip`  
2. Acesse a pasta raiz do projeto via terminal  
3. Baixe as dependências com:  
   ```bash
   mvn clean install
   ```
4. Inicie a aplicação com:  
   ```bash
   mvn spring-boot:run
   ```
5. Acesse a aplicação em:  
   ```
   http://localhost:8080
   ```
6. Teste os endpoints com navegador, Postman ou Insomnia  

## Observações

- O banco de dados é H2 em memória, sendo reiniciado a cada execução  
- A interface do H2 pode ser acessada em:  
  ```
  http://localhost:8080/h2-console
  ```
  **JDBC URL:** `jdbc:h2:mem:testdb`  
  **User:** `sa`  
  **Password:** *(em branco)*
