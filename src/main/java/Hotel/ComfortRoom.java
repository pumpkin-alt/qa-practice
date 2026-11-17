package Hotel;

import lombok.Getter;

@Getter
public class ComfortRoom extends Room {
    private boolean breakfast;

    public ComfortRoom(String number) {
        super(number);
        this.breakfast = true;
    }
    @Override
    public String getComfort() {
        return "comfort";
    }
}