package com.kaiokampos.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double soma = 0.0;


        double[] vect = new double[n];

        System.out.println("Digite os valores do vetor :");
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite o numero " + (i + 1));
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }
        double mediaVetor = (soma / n);

        System.out.println("MEDIA DO VETOR = " + String.format("%.3f", mediaVetor)) ;

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < mediaVetor){
                System.out.println(String.format("%.1f", vect[i]));
            }
        }

        sc.close();
    }
}
