package org.senai.Application;

import org.senai.Entities.Veiculo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Marca do carro: ");
        String marca = sc.nextLine();
        System.out.println("Modelo do carro: ");
        String modelo = sc.nextLine();
        System.out.println("Ano do carro: ");
        int ano = sc.nextInt();
        Veiculo veiculo = new Veiculo(marca, modelo, ano);
        System.out.println(veiculo);
    }
}
