package org.senai;

import java.util.Scanner;

public class ExemploRepeticaoReturn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        String resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("O número " + numero + " é: " + resultado);
    }
}
