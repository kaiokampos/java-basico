package com.kaiokampos.exercicios.application;

import com.kaiokampos.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número inteiro, entre 0 e 10");
        int n = sc.nextInt();

        while (n < 0 || n > 10){
            System.out.println("Entre com um número inteiro, entre 0 e 10");
            n = sc.nextInt();
        }

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++){
            System.out.println("entre com o numero: " + (i + 1));
            vect[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS: ");
        for (int i = 0; i < vect.length; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
