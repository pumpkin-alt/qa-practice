package Hotel.room;

import lombok.Getter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter

public abstract class Room {
    private String number;
    private Set<LocalDate> bookingDate;

    public Room(String number) {
        this.number = number;
        this.bookingDate = new HashSet<>();
    }

    public abstract String getComfort();

    public void book(LocalDate date) {
        LocalDate today = LocalDate.now();
        if (bookingDate.contains(date)) {
            throw new IllegalStateException("Номер уже забронирован, выбирите другую дату");
        } else if (date.isBefore(today)) {
            throw new IllegalStateException("Неверная дата, выберите дату бронирование с " + today);
        } else {
            bookingDate.add(date);
        }
    }

    public boolean isFree() {
        return bookingDate.isEmpty();
    }

    public boolean isBusyOn(LocalDate date) {
        return bookingDate.contains(date);
    }
}
