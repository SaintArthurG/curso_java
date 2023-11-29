package project2.application;

import project2.entities.Account;
import project2.entities.BusinessAccount;
import project2.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class AccountTest {
    public static void main(String[] args) {

        List <Account> list = new ArrayList<>();
        list.add(new SavingsAccount(1001, "Alex", 1000.00, 0.01));
        list.add(new BusinessAccount(1002, "Bob", 700.00, 1000.00));
        list.add(new SavingsAccount(1003, "Maria", 300.00, 0.05));
        list.add(new BusinessAccount(1004, "Lia", 500.00, 700.00));

        double sum = 0.0;
        for (Account c :
                list) {
            sum += c.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);

        for (Account c : list) {
            c.deposit(10.0);
        }
        for (Account a: list) {
            System.out.printf("Update balance for account %d: %.2f%n", a.getNumber(), a.getBalance());
        }
    }

}
