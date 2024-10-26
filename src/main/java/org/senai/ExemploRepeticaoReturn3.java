package org.senai;

public class ExemploRepeticaoReturn3 {
    public static void main(String[] args) {
        int nota = 85;

        //Usando o operador ternário para verificar a faixa de notas
        String desempenho = (nota >= 90)
                ? "Excelente" : (nota >= 70)
                ? "Bom" : "Precisa Melhorar";
    }
}
