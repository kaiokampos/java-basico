package com.kaiokampos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Digite a largura do retangulo");
        rectangle.width = sc.nextDouble();

        System.out.println("Digite a altura do retangulo");
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle);


        sc.close();
    }
}
