package com.kaiokampos;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
Exemplos:
Entrada:
5
6
7
8
Saída:
DIFERENCA = -26
Entrada:
5
6
-7
8
Saída:
DIFERENCA = 86
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int n1 = sc.nextInt();
        System.out.println("Digite um número inteiro");
        int n2 = sc.nextInt();
        System.out.println("Digite um número inteiro");
        int n3 = sc.nextInt();
        System.out.println("Digite um número inteiro");
        int n4 = sc.nextInt();

        int dif = (n1 * n2) - (n3 * n4);

        System.out.println("DIFERENCA = "+ dif);
        sc.close();
    }
}
