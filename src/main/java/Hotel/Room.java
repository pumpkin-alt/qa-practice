package Hotel;

import lombok.Getter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter

public abstract class Room {
    private String number;
    private Set<LocalDate> bookingDate = new HashSet<>();

    public Room(String number) {
        this.number = number;
    }

     public abstract String getComfort();

    public void book(LocalDate date) {
        LocalDate today = LocalDate.now();
        if (bookingDate.contains(date)) {
            throw new IllegalStateException("Номер уже забронирован, выбирите другую дату");
        } else if (date.isBefore(today)) {
            throw new IllegalStateException("Неверная дата, выбирите дату бронирование с " + today);
        } else {
            bookingDate.add(date);
        }
    }

    public String getFreeRoom() {

        if (bookingDate.isEmpty()) {
            return "Номер комнаты - " + number + "\nКомфорт - " + getComfort();
        }
        return "";
    }

    public String getFreeRoomOnThisDate(LocalDate bookingDate) {
        LocalDate today = LocalDate.now();

        if (bookingDate.isBefore(today)) {
            throw new IllegalStateException("Неверная дата, выбирите дату бронирование с " + today);
        }
        if (!this.bookingDate.contains(bookingDate)) {
            return "№ комнаты " + number;
        }
        return "";
    }
}
