package com.kaiokampos.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double maiorValor = 0.0;
        double posicaoMaiorValor = 0;

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++){
            System.out.println("Digite o numero " + (i+1));
            vect[i] = sc.nextDouble();
        }

        for (int i = 0; i < vect.length; i++){
            if (vect[i] > maiorValor){
                maiorValor = vect[i];
                posicaoMaiorValor = i;
            }
        }
        System.out.println("O maior número é: " + maiorValor);
        System.out.println("Posição do maior valor = "+ String.format("%.0f",posicaoMaiorValor));

        sc.close();
    }
}
