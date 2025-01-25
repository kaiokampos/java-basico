package com.kaiokampos.application;

import com.kaiokampos.entities.ImportedProduct;
import com.kaiokampos.entities.Product;
import com.kaiokampos.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");


        sc.close();




        Product productNormal = new Product("TV", 100.00);
        System.out.println(productNormal.priceTag());

        Product productImported = new ImportedProduct("Monitor", 100.00, 20.00);
        System.out.println(productImported.priceTag());


        DateTimeFormatter data = DateTimeFormatter.ofPattern("19/04/1987");
        Product manufactureProduct = new UsedProduct("Celular", 500.00, data);
        System.out.println(manufactureProduct.priceTag());
    }
}
