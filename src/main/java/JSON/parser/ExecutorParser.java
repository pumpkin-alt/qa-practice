package JSON.parser;


import JSON.model.Ip;
import lombok.Getter;
import lombok.Setter;

@Getter
public class ExecutorParser {
//    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    Ip ip;
    @Setter
    Parser parser;

    public ExecutorParser(Ip ip){
       this.ip = ip;
    }

//    public void setParser(Parser parser){
//        this.parser = parser;
//    }

    public void execute(){
        parser.output(ip.fetchJson());
    }

}
