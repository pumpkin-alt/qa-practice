package Hotel;

public class StandartRoom extends Room {
    private boolean breakFeast;

    public StandartRoom(String number) {
        super(number);
        this.breakFeast = false;
    }

    @Override
    public String getComfort() {
        return "standart";
    }
}
