package com.kaiokampos.conversao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Conversao {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate resultado1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate resultado2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println(resultado1);
        System.out.println(resultado2);

    }
}

