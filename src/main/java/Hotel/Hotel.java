package Hotel;

import Hotel.room.Room;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Hotel {
    private List<Room> rooms;
}
