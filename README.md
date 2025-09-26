# Programa Concessionária - Trabalho N1(AT2)

Este projeto foi desenvolvido como parte da atividade **N1AT2**, da disciplina de Programação Orientada a Objetos.  
O programa simula o sistema de uma concessionária, com controle de acesso por senha e menu interativo para operações básicas.

---

## 📌 Funcionalidades
- **Login com senha**  
  O usuário só acessa o sistema após digitar a senha correta (123).  

- **Menu principal**  
  - `1 - Cadastro Cliente` → permite registrar nome, telefone e endereço.  
  - `2 - Compra de Carro` → o usuário escolhe um modelo, cor e forma de pagamento.  
  - `3 - Compra de Acessório` → permite escolher um acessório e a quantidade desejada.  
  - `0 - Sair` → encerra o sistema.  

- **Validação de entradas**  
  O programa garante que apenas opções válidas sejam aceitas nos menus.

---

## ▶️ Como executar
1. Abra o projeto no seu editor Java (por exemplo: Eclipse ou IntelliJ).  
2. Certifique-se de que o arquivo esteja no pacote `programaConcessionaria`.  
3. Compile e execute a classe principal:

```bash
javac programaConcessionaria/N1AT2.java
java programaConcessionaria.N1AT2
