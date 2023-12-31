package project6.model.application;

import project6.model.entities.Reservation;
import project6.model.exception.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReservationTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Room number ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkInDate = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOutDate = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkInDate, checkOutDate);
            System.out.println("Reservation: " + reservation);
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-In (dd/MM/yyyy):");
            checkInDate = sdf.parse(sc.next());
            System.out.print("Check-Out (dd/MM/yyyy):");
            checkOutDate = sdf.parse(sc.next());
            reservation.updateDates(checkInDate, checkOutDate);
            System.out.println(reservation);

            } catch(ParseException e){
                System.out.println("Invalid date format");
            } catch(DomainException e){
                System.out.println("Error in reservation: " + e.getMessage());
            } catch (RuntimeException e){
            System.out.println("Unexpected error!");
        }
            sc.close();
        }
    }
