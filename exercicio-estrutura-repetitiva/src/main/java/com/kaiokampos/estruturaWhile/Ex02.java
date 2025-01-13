package com.kaiokampos.estruturaWhile;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
    /*
    Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
     */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as coordenadas X e Y: ");
        int coordenadaX = sc.nextInt();
        int coordenadaY = sc.nextInt();

        while (coordenadaX != 0 && coordenadaY != 0){
            if (coordenadaX > 0 && coordenadaY > 0) {
                System.out.println("primeiro");
            }
            else if (coordenadaX < 0 && coordenadaY > 0) {
                System.out.println("segundo");
            }
            else if (coordenadaX < 0 && coordenadaY < 0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }
            coordenadaX = sc.nextInt();
            coordenadaX = sc.nextInt();
        }

        sc.close();

    }
}