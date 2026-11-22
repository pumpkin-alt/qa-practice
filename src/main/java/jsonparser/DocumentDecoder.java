package jsonparser;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import jsonparser.model.Ip;
import lombok.AllArgsConstructor;
import org.jsoup.Jsoup;

import java.io.IOException;

@AllArgsConstructor
public class DocumentDecoder {

    private String url;

    public Ip fetchJson() {
        try {
            var document = Jsoup.connect(url).ignoreContentType(true).get();
            return convert(document.body().text());
        } catch (IOException e) {
            throw new RuntimeException("Не удалось скачать " + url, e);
        }
    }

    private Ip convert(String json) {
        try {
            Gson gson = new Gson();
            return gson.fromJson(json, Ip.class);
        } catch (JsonParseException e) {
            System.out.println("Не смогли спарсить" + e);
            return new Ip();
        }
    }
}
