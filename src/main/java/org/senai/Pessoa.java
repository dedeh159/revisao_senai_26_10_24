package org.senai;

import java.util.Scanner;

public class Pessoa {
    // Atributos (variáveis de instância)
    String nome;
    int idade;
    //Construtor da classe pessoa

    public Pessoa(String nome, int idade) {
        this.nome = nome; //this se refere ao atributo da instância
        this.idade = idade;
    }

    //Metodo para exibir as informações da pessoa
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    // Metodo principal (main) para testar a classe

}
