package com.kaiokampos.exercicios;

public class Student {
    public String name;
    public double nota1, nota2, nota3;

    public double media(){
        double peso = (nota1 * 30) + (nota2 * 35) + (nota3 * 35);
        double divisorPeso = (nota1 + nota2 + nota3);
        return peso / divisorPeso;
    }

    public void isPass() {


        if (media() >= 60) {
            System.out.println("PASS");
            System.out.println("FINAL GRADE " + media());
        } else{
            System.out.println("FINAL GRADE " + media());
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60.00 - media());
        }
    }
}

