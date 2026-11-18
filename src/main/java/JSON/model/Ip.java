package JSON.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jsoup.Jsoup;

@Getter
@AllArgsConstructor
public class Ip {

    private String url;

    public String fetchJson() {
        try {
            var document = Jsoup.connect(url).ignoreContentType(true).get();
            return document.body().text();

        } catch (Exception e) {
            throw new RuntimeException("Не удалось скачать " + url, e);
        }
    }
}
