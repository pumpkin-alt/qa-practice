package Hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms = new ArrayList<>();

    public Hotel(List<Room> rooms){
       this.rooms = rooms;
    }

    public List<Room> getRooms(){
       return rooms;
    }

}
