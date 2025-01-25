package com.kaiokampos.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(String name, Double price, DateTimeFormatter dateTimeFormatter) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufacturedDate() {
        return manufactureDate;
    }

    public void setManufacturedDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return  super.getName() + " (used) $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + ")";
    }


}
