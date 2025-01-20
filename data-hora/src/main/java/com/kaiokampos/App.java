package com.kaiokampos;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        System.out.println(localDate);
        System.out.println(dateTime);
        System.out.println(instant);
        System.out.println("Horarios");

    }
}
