package com.kaiokampos.estruturaWhile;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
    /*
    Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
     */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua senha: ");
        int senhaCorreta = sc.nextInt();

        while (senhaCorreta != 2002){
            System.out.println("Digite a sua senha novamente: ");
            senhaCorreta = sc.nextInt();
        }

        System.out.println("Acesso Permitido");
        sc.close();

    }
}
