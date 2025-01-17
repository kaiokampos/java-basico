package com.kaiokampos.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int numeroPares = 0;
        double somaPares = 0.0;
        double media = 0.0;


        int[] vect = new int[n];

        System.out.println("Digite os valores do vetor :");
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite o numero " + (i + 1));
            vect[i] = sc.nextInt();
        }


        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                somaPares += vect[i];
                numeroPares++;

            }
        }

        media = (somaPares / numeroPares);

        if (somaPares == 0.0){
            System.out.println("NENHUM NUMERO PAR");
        }else {
            System.out.println("media dos pares = " + String.format("%.1f", media));
        }

       sc.close();
    }
}
