package com.kaiokampos;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate localDate = LocalDate.now(); // instancia a data atual, de agora
        LocalDateTime dateTime = LocalDateTime.now(); //instancia a hora atual, de agora
        Instant instant = Instant.now();// Instancia a data hora GMT, com o horario de londres.

        LocalDate localDate1 = LocalDate.parse("2025-07-19");
        LocalDateTime localDateTime = LocalDateTime.parse("2025-07-19T09:30:19");
        Instant instant1 = Instant.parse("2025-07-19T09:30:19Z");
        Instant instant2 = Instant.parse("2025-07-19T09:30:19-03:00");

        LocalDate localDate2 = LocalDate.parse("19/07/2025", fmt1);
        LocalDateTime localDateTime1 = LocalDateTime.parse("19/07/2025 01:30", fmt2);

        LocalDate localDate3 = LocalDate.of(2025, 7, 19);
        LocalDateTime localDateTime2 = LocalDateTime.of(2025, 7, 19, 1, 30);

        System.out.println("-----Datas do sistema-----");
        System.out.println(localDate);
        System.out.println(dateTime);
        System.out.println(instant);
        System.out.println("-----Datas do sistema-----");
        System.out.println();
        System.out.println("-----Datas iso 8601-----");
        System.out.println(localDate1);
        System.out.println(localDateTime);
        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println("-----Datas iso 8601-----");
        System.out.println();
        System.out.println("-----Datas formatadas no seu padrão-----");
        System.out.println(localDate2);
        System.out.println(localDateTime1);
        System.out.println("-----Datas formatadas no seu padrão-----");

        System.out.println(localDate3);
        System.out.println(localDateTime2);
    }
}
