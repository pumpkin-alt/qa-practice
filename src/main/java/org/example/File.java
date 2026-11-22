package org.example;

import org.jsoup.Jsoup;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class File {
    public static void main(String[] args) {
        Optional<String> ip;
        String ipp;
        try {
            var document = Jsoup.connect("https://api.ipify.org/?format=json").ignoreContentType(true).get();
            ipp = document.body().text();

            ip =  Optional.ofNullable(document.body().text());
            ip = null;
        } catch (IOException r) {
            throw new RuntimeException("Не удалось скачать " + r);
        }

        try {
            Files.writeString(Path.of("kava.json"), ip.get());
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println(Files.readString(Path.of("kava.json")));
        } catch (IOException e) {
            throw new RuntimeException("Не удалось прочитать");
        }
    }
}
