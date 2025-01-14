package com.kaiokampos.exercicios;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        double percent = (grossSalary * percentage) / 100;
        this.grossSalary += percent;
    }

    @Override
    public String toString() {
        return "Employee: " + name +
                ", $ " + String.format("%.2f",netSalary());
    }
}
