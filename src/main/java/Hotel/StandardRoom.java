package Hotel;

public class StandardRoom extends Room {
    private boolean breakfast;

    public StandardRoom(String number) {
        super(number);
        this.breakfast = false;
    }

    @Override
    public String getComfort() {
        return "standart";
    }
}
