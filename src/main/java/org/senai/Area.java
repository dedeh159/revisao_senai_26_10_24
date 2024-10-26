package org.senai;

import java.util.Locale;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double raio = 3.4;
        final double PI = 3.14159;
        //pi = 3.6;
        double area = PI * raio * raio;
        System.out.printf("%.2f\n",area);


        System.out.println("Digite um valor inteiro: ");
        int valor;
        valor = sc.nextInt();
        System.out.println("Valor Digitado: " + valor);

    }
}