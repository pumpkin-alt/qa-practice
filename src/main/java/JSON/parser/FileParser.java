package JSON.parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileParser implements Parser {

    @Override
    public void output(String json) {
        try {
            Files.writeString(Path.of("ip.json"), json);
        } catch (IOException e) {
            throw new RuntimeException("Не удалось записать файл", e);
        }
    }
}
