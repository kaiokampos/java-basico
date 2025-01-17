package com.kaiokampos.exercicios.application;

import com.kaiokampos.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        Rent[] vectRoom = new Rent[10];

        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Rent #" + (i+1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();

            vectRoom[room] = new Rent(name, email);
            System.out.println();

        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < vectRoom.length; i++){
            if (vectRoom[i] != null){
                System.out.println(i+ " : " + vectRoom[i].getName() + " , " + vectRoom[i].getEmail());
            }
        }

        sc.close();
    }
}
