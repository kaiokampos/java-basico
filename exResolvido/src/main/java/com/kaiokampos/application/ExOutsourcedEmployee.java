package com.kaiokampos.application;

import com.kaiokampos.entities.Employee;
import com.kaiokampos.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExOutsourcedEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int numberOfEmployees = sc.nextInt();

        for (int i = 1; i <= numberOfEmployees; i++) {
            System.out.print("Employee #" + i + " data");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);

            sc.nextLine(); //Consumir quebra de linha
            System.out.print("Name: ");
            String nameEmployee = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y' || ch == 'Y') {
                System.out.print("Aditional charge: ");
                double additionalCharge = sc.nextDouble();
                employeeList.add(new OutsourcedEmployee(nameEmployee, hours, valuePerHour, additionalCharge));
            } else {
                employeeList.add(new Employee(nameEmployee, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + " - $" + String.format("%.2f", employee.payment()));
        }


        sc.close();
    }
}
