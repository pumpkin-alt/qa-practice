package jsonparser.parser;


import jsonparser.DocumentDecoder;
import lombok.Getter;
import lombok.Setter;

@Getter
public class ExecutorParser {

    DocumentDecoder ip;
    @Setter
    Parser parser;

    public ExecutorParser(DocumentDecoder ip) {
        this.ip = ip;
    }

    public void execute() {
        parser.output(ip.fetchJson());
    }

}
