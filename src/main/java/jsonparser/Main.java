package jsonparser;

import jsonparser.parser.ConsoleParser;
import jsonparser.parser.ExecutorParser;
import jsonparser.parser.FileParser;

public class Main {
    public static void main(String[] args) {
        DocumentDecoder outPutIp = new DocumentDecoder("https://api.ipify.org/?format=json");



        ExecutorParser jsonParse = new ExecutorParser(outPutIp);

        jsonParse.setParser(new ConsoleParser());
        jsonParse.execute();

        jsonParse.setParser(new FileParser());
        jsonParse.execute();



    }
}
