package com.kaiokampos.listas.application;

import com.kaiokampos.listas.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExFixacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> listEmployee = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int sizeVector = sc.nextInt();

        for (int i = 0; i < sizeVector; i++) {
            System.out.println();

            System.out.println("Employee #" + (i + 1) + ":");

            System.out.print("Id: ");
            Integer id = sc.nextInt();

            while (hasId(listEmployee, id)){
                System.out.println("Id already taken! tryt again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);

            listEmployee.add(employee);
        }

        System.out.println("Enter the employee id that will have salary increase : ");
        int idSalary = sc.nextInt();

        Employee employee = listEmployee.stream().filter(employe -> employe.getId() == idSalary).findFirst().orElse(null);

        if (employee == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            employee.increaseSalaray(percent);
        }

        //Integer position = positionIdList(listEmployee, idSalary);

//        if (position == null){
//            System.out.println("This id does not exist!");
//        }else {
//            System.out.println("Enter the percentage: ");
//            double percent = sc.nextDouble();
//            listEmployee.get(position).increaseSalaray(percent);
//        }

        System.out.println();
        System.out.println("List of employees: ");

        for (Employee emp : listEmployee) {
            System.out.println(emp);
        }


        sc.close();
    }

    public static Integer positionIdList(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
