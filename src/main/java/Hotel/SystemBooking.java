package Hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SystemBooking {
    private List<Room> rooms = new ArrayList<>();

    public SystemBooking(List<Room> rooms){
        this.rooms = rooms;
    }

    public List<Room> getRooms(){
        return rooms;
    }

    public void getAllFreeRooms(){
        for (Room name  : rooms) {
           System.out.println(name.getFreeRoom());
        }
    }

    public void getFreeRoomAtThisDay(LocalDate bookingDate){
        for (Room name : rooms){
           System.out.println(name.getFreeRoomOnThisDate(bookingDate));
        }
    }

}
