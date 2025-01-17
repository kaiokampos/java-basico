package com.kaiokampos.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int tamanhoVetor = sc.nextInt();

        double soma = 0;
        double mediaDoAluno = 0.0;


        String[] nomeAlunos = new String[tamanhoVetor];
        double[] notaPrimeiroSemestre = new double[tamanhoVetor];
        double[] notaSegundoSemestre = new double[tamanhoVetor];
        double[] mediaAlunos = new double[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            sc.nextLine();
            System.out.println("Digite nome, primeira e segunda nota do  " + (i + 1) + "a aluno: ");
            nomeAlunos[i] = sc.nextLine();
            notaPrimeiroSemestre[i] = sc.nextDouble();
            notaSegundoSemestre[i] = sc.nextDouble();
        }

        for (int i = 0; i < tamanhoVetor; i++){
            soma = notaPrimeiroSemestre[i] + notaSegundoSemestre[i];
            mediaAlunos[i] = mediaDoAluno;
            mediaDoAluno = soma / 2;
            mediaAlunos[i] = mediaDoAluno;
        }
//        System.out.println("soma-------"+soma);
//        System.out.println("media Do Alunos-------"+mediaDoAluno);


        System.out.println("Alunos aprovados:");
        for (int i = 0; i < tamanhoVetor; i++){
            if (mediaAlunos[i] >= 6.0){
                System.out.println(nomeAlunos[i]);
            }
        }



        sc.close();
    }
}
