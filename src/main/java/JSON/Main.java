package JSON;

import JSON.model.Ip;
import JSON.parser.ConsoleParser;
import JSON.parser.ExecutorParser;
import JSON.parser.FileParser;

public class Main {
    public static void main(String[] args) {
        Ip outPutIp = new Ip("https://api.ipify.org/?format=json");

        ExecutorParser jsonParse = new ExecutorParser(outPutIp);

        jsonParse.setParser(new ConsoleParser());
        jsonParse.execute();

        jsonParse.setParser(new FileParser());
        jsonParse.execute();



    }
}
