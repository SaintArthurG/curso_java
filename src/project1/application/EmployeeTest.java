package project1.application;

import project1.entities.Employee;
import project1.entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        Employee emp;
        System.out.print("Enter the number of employees: ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("Employee #" + (i + 1) + " data: ");
            System.out.print("Outsourced (y/n) ");
            char resp = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hours: ");
            double valuePH = sc.nextDouble();
            double additionalCharge = 0;
            if (resp == 'y') {
                System.out.print("Additional charge: ");
                additionalCharge = sc.nextDouble();
                emp = new OutsourceEmployee(name, hours, valuePH, additionalCharge);
                employees.add(emp);
            } else {
                emp = new Employee(name, hours, valuePH);
                employees.add(emp);
            }
        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee e :
                employees) {
            System.out.println(e.toString());
        }
        sc.close();
    }

}
