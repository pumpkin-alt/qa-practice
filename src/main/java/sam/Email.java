package sam;

public class Email extends NotificationChannel {
    private String email;

    public Email(String nameOfChannel, String email){
        super(nameOfChannel);
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void getInfoError() {
        System.out.println("Отправлено через " + getNameOfChannel() + " на " + getEmail() + ": " + getMessageName());
    }
}