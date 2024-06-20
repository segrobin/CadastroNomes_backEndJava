# CadastroNomes_backEndJava
BackEnd Java para cadastro de Nomes

# Sistema de Gerenciamento de Usuários - Backend

Este projeto é a parte backend de um sistema simples de gerenciamento de usuários. Ele é construído com Spring Boot e utiliza um banco de dados H2 para armazenamento de dados.

## Índice

- [Recursos](#recursos)
- [Pré-requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Uso](#uso)
- [Endpoints da API](#endpoints-da-api)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Contribuindo](#contribuindo)
- [Licença](#licença)

## Recursos

- Adicionar novos usuários
- Pesquisar usuários por nome
- Excluir usuários
- Listar todos os usuários

## Pré-requisitos

- Java 17 ou superior
- Maven

## Instalação

1. Clone o repositório:
   git clone https://github.com/segrobin/CadastroNomes_backEndJava.git
   
   cd sistema-de-gerenciamento-de-usuarios/CadastroNomes_backEndJava
Compile o projeto com Maven:
mvn clean install
Execute a aplicação Spring Boot:
mvn spring-boot:run

Uso
O backend estará rodando em http://localhost:8097.

Use uma ferramenta como Postman ou cURL para interagir com os endpoints da API.

Endpoints da API
Endpoints de Usuário
Adicionar Usuário

URL: /users/addUser
Método: POST
Corpo da Requisição: { "name": "NomeDoUsuario" }
Pesquisar Usuários

URL: /users/findByName
Método: GET
Parâmetros de Consulta: name=NomeDoUsuario
Excluir Usuário

URL: /users/deleteByName
Método: DELETE
Corpo da Requisição: { "name": "NomeDoUsuario" }
Listar Todos os Usuários

URL: /users/findAll
Método: GET
