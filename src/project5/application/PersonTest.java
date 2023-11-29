package project5.application;

import project5.entities.NaturalPerson;
import project5.entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print("Natural Person or Legal Person? (n/l)");
            char ans = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Annual income:");
            double annualIncome = sc.nextDouble();
            if (ans == 'n'){
                System.out.print("Heath expenditures:");
                double heathSpents = sc.nextDouble();
                persons.add(new NaturalPerson(name, annualIncome, heathSpents));
            } else if (ans == 'l') {

            } else {
                System.out.println("Incorrect Answer");
                return;
            }
        }
        for (Person p :
                persons) {
            System.out.println(p.taxes());
        }

        sc.close();
    }
}
