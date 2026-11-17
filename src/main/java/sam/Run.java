package sam;

public class Run {
    public static void main(String[] args) {
        NotificationChannel user1 = new Telegram("Telegram", "user1NickName");
        NotificationChannel user2 = new Email("Email", "user2@mail.ru");
        NotificationChannel user3 = new SMS("NumberPhone", "+79999999999");

        NotificationChannel[] recipients = new NotificationChannel[]{user1, user2, user3};
        for (int i = 0; i < recipients.length; i++) {
            recipients[i].getInfoError();
        }
    }
}
