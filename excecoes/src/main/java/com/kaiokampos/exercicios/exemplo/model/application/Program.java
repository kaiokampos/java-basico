package com.kaiokampos.exercicios.exemplo.model.application;

import com.kaiokampos.exercicios.exemplo.model.entites.Reservation;
import com.kaiokampos.exercicios.exemplo.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        //Capturando a excecao de conversao de data no metodo parse
        catch (ParseException parseException) {
            System.out.println("Invalid date format");
        }
        //Capturando a excecao gerada pelo metodo reservation.updateDates(checkIn, checkOut)
        //Onde podemos ter problemas com as datas.
        catch (DomainException domainException) {
            System.out.println("Error in reservation " + domainException.getMessage());
        }
        //Qualquer erro inesperado
        catch (RuntimeException runtimeException){
            System.out.println("Unexpected error");
        }
        sc.close();
    }
}
