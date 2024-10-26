package org.senai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Nome da pessoa: ");
        //String nome = sc.nextLine();
        //System.out.print("Idade da pessoa: ");
        //int idade = sc.nextInt();

        //Pessoa p1 = new Pessoa(nome, idade);

        //System.out.print("Nome da pessoa 2: ");
        //sc.nextLine();
        //nome = sc.nextLine();
        //System.out.print("Idade da pessoa 2: ");
        //idade = sc.nextInt();
        //sc.nextLine();

        //Pessoa p2 = new Pessoa2(nome, idade);


        //System.out.print("Nome da pessoa 3: ");
        //nome = sc.nextLine();
        //System.out.print("Idade da pessoa 3: ");
        //idade = sc.nextInt();
        //sc.nextLine();
        //Pessoa p3 = new Pessoa3(nome, idade);
        //p1.exibirInformacoes();
        //p2.exibirInformacoes();
        //p3.exibirInformacoes();

        PessoaConstrutores pessoa = new PessoaConstrutores("Maria", 25);
        pessoa.exibirInformacoes();
        PessoaConstrutores pessoa2 = new PessoaConstrutores("Carlos");
        pessoa2.exibirInformacoes();


    }
}
