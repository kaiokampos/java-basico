package com.kaiokampos.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("kaio");
        list.add(2, "Marco");

        System.out.println("Tamnho da Lista --- " + list.size());

        for (String nome : list){
            System.out.println(nome);
        }

        System.out.println("----------------------------------------------");

        list.removeIf(nome -> nome.charAt(0) == 'M');

        for (String nome : list){
            System.out.println(nome);
        }

        System.out.println("----------------------------------------------");

        System.out.println("Index of Bob: "+list.indexOf("Bob"));
        System.out.println("Index of Marco: "+list.indexOf("Marco")); // Retorna -1, caso não encontre o index = "Marco"

        System.out.println("----------------------------------------------");

        List<String> listNameA = list.stream().filter(nome -> nome.charAt(0) == 'A').collect(Collectors.toList());

        for (String nome : listNameA){
            System.out.println(nome);
        }
        System.out.println("----------------------------------------------");

        String name = list.stream().filter(nome -> nome.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);


    }
}
