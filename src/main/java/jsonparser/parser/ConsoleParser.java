package jsonparser.parser;

import jsonparser.model.Ip;

public class ConsoleParser implements Parser {

  public void output(Ip json){
      System.out.println(json.getIp());
  }
}
