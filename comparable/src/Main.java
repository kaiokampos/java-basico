import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\KaioDev\\nameSalary.txt";

        List<Employee> nameSalaryList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader( new FileReader(path))) {

            String line = bufferedReader.readLine();
            while (line != null){
                String[] fields = line.split(",");
                nameSalaryList.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                line = bufferedReader.readLine();
            }
            Collections.sort(nameSalaryList);

            for (Employee employee : nameSalaryList){
                System.out.println(employee.getName() + ", " + employee.getSalary());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}