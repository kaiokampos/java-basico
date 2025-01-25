package com.kaiokampos.application;

import com.kaiokampos.entities.ImportedProduct;
import com.kaiokampos.entities.Product;
import com.kaiokampos.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProgramProduct {
    public static void main(String[] args) {
        Product productNormal = new Product("TV", 100.00);
        System.out.println(productNormal.priceTag());

        Product productImported = new ImportedProduct("Monitor", 100.00, 20.00);
        System.out.println(productImported.priceTag());

        Product manufactureProduct = new UsedProduct("Celular", 500.00, LocalDate.parse(DateTimeFormatter.ofPattern(19/04/1987)));
    }
}
