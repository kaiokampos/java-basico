package com.kaiokampos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.println("Name of student: ");
        student.name = sc.nextLine();

        System.out.println("primeira nota: ");
        student.nota1 = sc.nextDouble();

        System.out.println("segunda nota: ");
        student.nota2 = sc.nextDouble();

        System.out.println("terceira nota: ");
        student.nota3 = sc.nextDouble();

        student.isPass();



        sc.close();
    }
}
