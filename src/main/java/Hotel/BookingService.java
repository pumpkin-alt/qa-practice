package Hotel;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
@AllArgsConstructor

public class BookingService {
    private List<Room> rooms;

    public String format(Room room) {
        return "Номер комнаты: " + room.getNumber() + "\nКласс: " + room.getComfort() + "\n";
    }

    public void printFreeRooms() {
        for (Room room : rooms) {
            if (room.isFree()) {
                System.out.println(format(room));
            }
        }
    }

    public void printFreeRoomsOn(LocalDate bookingDate) {
        LocalDate today = LocalDate.now();
        if (bookingDate.isBefore(today)) {
            throw new IllegalArgumentException("Неверная дата, выберите дату бронирование с " + today);
        }
        for (Room room : rooms) {
            if (!room.isBusyOn(bookingDate)) {
                System.out.println(format(room));
            }
        }
    }

}
