package com.kaiokampos.exercicios.application;

import com.kaiokampos.entities.Product;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números gostaria de digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++){
            System.out.println("entre com o numero: " + (i + 1));
            vect[i] = sc.nextDouble();
        }


        System.out.print("Valores: ");
        for (int i = 0; i < vect.length; i++){
            System.out.print(vect[i] + " ");
        }

        System.out.println();
        double sum = 0.0;

        for (int i = 0; i < vect.length; i++){
            sum += vect[i];
        }

        System.out.printf("SOMA = %.2f\n", sum);

        double avg = sum / n;

        System.out.printf("MEDIA = %.2f\n", avg);



        sc.close();
    }
}
