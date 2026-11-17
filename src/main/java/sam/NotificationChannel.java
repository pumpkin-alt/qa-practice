package sam;

public class NotificationChannel implements GetInfoError {
    private String messageName;
    private String nameOfChannel;

    public NotificationChannel(String nameOfChannel){
        this.messageName = "Тест упал с ошибкой 500";
        this.nameOfChannel = nameOfChannel;
    }

    public String getNameOfChannel(){
        return nameOfChannel;
    }
    public String getMessageName(){
        return messageName;
    }

    public void getInfoError(){
        System.out.println("Тест упал с ошибкой 500");
    }
}
