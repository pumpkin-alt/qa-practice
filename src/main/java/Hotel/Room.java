package Hotel;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public abstract class Room {
    private String number;
    private Set<LocalDate> bookingDate = new HashSet<>();

    public Room(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    abstract public  String getComfort();

    public void setBookingDate(LocalDate date){
        LocalDate today = LocalDate.now();
        if (bookingDate.contains(date)){
            throw new IllegalStateException("Номер уже забронирован, выбирите другую дату");
        } else if (date.isBefore(today)) {
            throw new IllegalStateException("Неверная дата, выбирите дату бронирование с " + today);
        } else {
            bookingDate.add(date);
        }
    }

    public String getFreeRoom() {

        if (bookingDate.isEmpty()) {
//            System.out.println("Номер комнаты - " + number + "\n Компфорт - " + comfort);
            return "Номер комнаты - " + number + "\nКомфорт - " + getComfort();
        }
        return "";
    }

    public String getFreeRoomOnThisDate(LocalDate bookingDate){
        LocalDate today = LocalDate.now();

        if (bookingDate.isBefore(today)){
            throw new IllegalStateException("Неверная дата, выбирите дату бронирование с " + today);
        }
        if (!this.bookingDate.contains(bookingDate)){
            return "№ комнаты " + number;
        }

        return "";
    }

    public Set<LocalDate> getBookingDate(){
        return bookingDate;
    }

}
