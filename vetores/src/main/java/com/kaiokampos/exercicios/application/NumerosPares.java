package com.kaiokampos.exercicios.application;

import com.kaiokampos.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int qtPares = 0;

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++){
            System.out.println("Digite o numero " + (i+1));
            vect[i] = sc.nextInt();
        }


        System.out.println("Números Pares: ");
        for (int i = 0; i < vect.length; i++){
            if (vect[i] % 2 == 0){
                System.out.print(vect[i] + " ");
                qtPares++;
            }
        }
        System.out.println();
        System.out.println("Quantidade de números pares = "+ qtPares);

        sc.close();
    }

}
