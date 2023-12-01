package project6.model.entities;

import project6.model.exception.DomainException;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Reservation {
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Integer roomNumber;
    private Date checkInDate;
    private Date checkOutDate;

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException{
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkInDate = checkIn;
        this.checkOutDate = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkInDate;
    }

    public Date getCheckOut() {
        return checkOutDate;
    }

    public long duration() {
        LocalDateTime checkInDateLocal = checkInDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime checkOutDateLocal = checkOutDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        Duration dif = Duration.between(checkInDateLocal, checkOutDateLocal);
        return dif.toDays();
    }

    public void updateDates (Date checkInDate, Date checkOutDate) throws DomainException {
        Date now = new Date();
        if (checkInDate.before(now) || checkOutDate.before(now)) {
            throw new DomainException("Reservation dates for update must be future dates");
        }
        if (!checkOutDate.after(checkInDate)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    @Override
    public String toString() {
        LocalDateTime checkInDateLocal = checkInDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime checkOutDateLocal = checkOutDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

        StringBuilder sb = new StringBuilder();
        sb.append("Room ").append(roomNumber).append(" check-in: ").append(fmt1.format(checkInDateLocal)).append(", check-out ").
                append(fmt1.format(checkOutDateLocal)).append(", ").append(duration()).append(" nights");
        return sb.toString();
    }
}
