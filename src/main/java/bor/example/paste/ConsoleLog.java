package bor.example.paste;

public class ConsoleLog implements Logger{
    @Override
    public void log(String message) {
        System.out.println("CONSOLE: " + message);
    }

}
