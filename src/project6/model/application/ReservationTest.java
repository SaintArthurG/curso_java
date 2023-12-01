package project6.model.application;

import project6.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ReservationTest {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Room number ");
        int number = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkInDate = sdf.parse(sc.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOutDate = sdf.parse(sc.next());

        if (!checkOutDate.after(checkInDate)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(number, checkInDate, checkOutDate);
            System.out.println("Reservation: " + reservation);
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-In (dd/MM/yyyy):");
            checkInDate = sdf.parse(sc.next());
            System.out.print("Check-Out (dd/MM/yyyy):");
            checkOutDate = sdf.parse(sc.next());

            Date now = new Date();
            if (checkInDate.before(now) || checkOutDate.before(now)){
                System.out.println("Error in reservation: Reservation dates for update must be future's one");
            } else if (!checkOutDate.after(checkInDate)) {
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            } else {
                reservation.updateDates(checkInDate, checkOutDate);
                System.out.println(reservation);
            }


        }



        sc.close();
    }
}
