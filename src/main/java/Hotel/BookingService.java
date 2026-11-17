package Hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private List<Room> rooms = new ArrayList<>();

    public BookingService(List<Room> rooms){
        this.rooms = rooms;
    }

    public List<Room> getRooms(){
        return rooms;
    }

    public void getAllFreeRooms(){
        for (Room room  : rooms) {
           System.out.println(room.getFreeRoom());
        }
    }

    public void getFreeRoomAtThisDay(LocalDate bookingDate){
        for (Room name : rooms){
           System.out.println(name.getFreeRoomOnThisDate(bookingDate));
        }
    }

}
