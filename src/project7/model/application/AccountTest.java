package project7.model.application;

import project7.model.entities.Account;
import project7.model.exceptions.DomainException;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            Account acc = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println(acc);

            System.out.println();
            System.out.print("Enter the amount of deposit: ");
            double amountDeposit = sc.nextDouble();
            acc.deposit(amountDeposit);

            System.out.println(acc);

            System.out.println();
            System.out.print("Enter the amount of withdraw: ");
            double amountWithdraw = sc.nextDouble();
            acc.withdraw(amountWithdraw);

            System.out.println(acc);
            sc.close();

        } catch (DomainException e){
            System.out.println("Error " + e.getMessage());
        } catch (RuntimeException e){
            System.out.println("Something went wrong, try again later!");
        }




    }
}
