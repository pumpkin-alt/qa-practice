package bor.example.paste;

public class LoggerService {
    public static void main(String[] args) {
        FileLog fileLog = new FileLog();
        ConsoleLog consoleLog = new ConsoleLog();

        Logger[] loggers = new Logger[]{fileLog, consoleLog};

        for (int i = 0; i < loggers.length; i++){
            loggers[i].log("Тест пройден успешно");
        }
    }
}
