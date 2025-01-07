package com.kaiokampos;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int y = 42;
        double x = 10.35784;
        System.out.printf("%.4f%n", x);
        System.out.println(x);
        System.out.println(x);
    }
}