package Hotel;

import lombok.Getter;

@Getter
public class ComfortRoom extends Room {
    private boolean breakfast;

    public ComfortRoom(String number) {
        super(number);
        this.breakfast = true;
    }

    public String getFreeRoom() {

        if (getBookingDate().isEmpty()) {
            return "Номер комнаты - " + getNumber() + "\nКомфорт - " + getComfort() + "\n";
        }
        return "";
    }

    @Override
    public String getComfort() {
        return "comfort";
    }
}