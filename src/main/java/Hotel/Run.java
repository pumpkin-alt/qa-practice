package Hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Run {
    public static void main(String[] args) {
        ComfortRoom comfortRoom01 = new ComfortRoom("C01");
        ComfortRoom comfortRoom02 = new ComfortRoom("C02");
        StandardRoom standartRoom01 = new StandardRoom("S02");
        Room room1 = new ComfortRoom("1");

        List<Room> roomsList = new ArrayList<>();

        roomsList.add(comfortRoom01);
        roomsList.add(comfortRoom02);
        roomsList.add(standartRoom01);

        Hotel rooms = new Hotel(new ArrayList<Room>(roomsList));

        BookingService room = new BookingService(rooms.getRooms());


//        room.printFreeRoom();
//        comfortRoom01.setBookingDate(LocalDate.of(2026, 12, 13));
        comfortRoom01.book(LocalDate.of(2026, 12, 13));
//
         room.printFreeRoomsOn(LocalDate.of(2026, 12, 13));


    }
}
