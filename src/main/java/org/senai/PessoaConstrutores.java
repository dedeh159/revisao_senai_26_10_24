package org.senai;

public class PessoaConstrutores {

    String nome;
    int idade;

    public PessoaConstrutores(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public PessoaConstrutores(String nome) {
        this.nome = nome;
        this.idade = 0;
    }
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
