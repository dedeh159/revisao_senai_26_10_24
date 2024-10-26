package org.senai;

public class ExemploRepeticaoReturn2 {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10};
        int resultado = encontrarNumero(numeros, 6);
        if (resultado != -1) {
            System.out.println("Número encontrado: " + resultado);
        } else {
            System.out.println("Número não encontrado.");
        }
    }

    public static int encontrarNumero(int[] array, int numeroProcurado) {
        //Loop para percorrer o array
        for (int i = 0; i < array.length; i++) {
            //verifica se o numero atual é igual ao procurado
            if (array[i] == numeroProcurado) {
                return array[i]; // Retorna o número encontrado e interrompe o loop
            }

        }
        return -1;
    }

}
