package bor.example.paste;

public class FileLog implements Logger{
    @Override
    public void log(String message) {
        System.out.println("FILE: " + message);
    }
}
