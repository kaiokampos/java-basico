package com.kaiokampos.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos pessoas vai digitar? ");
        int tamanhoVetor = sc.nextInt();
        int maiorIdade = 0;
        int posicaoMaiorIdade = 0;

        int[] idadePessoas = new int[tamanhoVetor];
        String[] nomePessoas = new String[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomePessoas[i] = sc.nextLine();
            System.out.print("Idade: ");
            idadePessoas[i] = sc.nextInt();
        }


        for (int i = 0; i < idadePessoas.length; i++) {
            if (idadePessoas[i] > maiorIdade) {
                maiorIdade += idadePessoas[i];
                posicaoMaiorIdade = i;
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + nomePessoas[posicaoMaiorIdade]);


        sc.close();
    }
}
