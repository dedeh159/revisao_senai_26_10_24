package org.senai;

public class Aula03 {
    public static void main(String[] args) {
        System.out.println("Olá " + args[0]);
        System.out.println("Olá " + args[1]);
        System.out.println("Olá " + args[2]);
        int x = 0;
        if (x > 0) {
            System.out.println("x é positivo");
        } else if (x < 0) {
            System.out.println("x é negativo");
        } else {
            System.out.println("x é zero");
        }

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Dia inválido");
                break;
        }

        for (int i = 0; i < 5; i++){
            System.out.println("i = " + i);
        }

        for (int i = 0; i < 10; i++){
            if (i == 5){
                break;
            }
            System.out.println("i = " + i);
        }
        for (int i = 0; i < 10; i++){
            if (i == 5){
                continue;
            }
            System.out.println("i = " + i);
        }

    }
}
