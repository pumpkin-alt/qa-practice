package sam;

public class Telegram extends NotificationChannel {
    private String nickName;

    public Telegram(String nameOfChannel, String nickName){
        super(nameOfChannel);
        this.nickName = nickName;
    }
    public String getNickName(){
        return nickName;
    }

    @Override
    public void getInfoError() {
        System.out.println("Отправлено через " + getNameOfChannel() + " на " + getNickName() + ": " + getMessageName());
    }
}
