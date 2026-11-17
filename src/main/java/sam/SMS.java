package sam;

public class SMS extends NotificationChannel {
    private String numberPhone;

    public SMS(String nameOfChannel, String numberPhone) {
        super(nameOfChannel);
        this.numberPhone = numberPhone;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void getInfoError() {
        System.out.println("Отправлено через " + getNameOfChannel() + " на " + getNumberPhone() + ": " + getMessageName());
    }
}
