package lr10.example4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class NewsParser {
    public static void main(String[] args) {
        try{
            //Сайт http://fat.urfu.ru/index.html недоступен, поэтому парсим статьи с хабра. Получаем HTML-код страницы
            Document doc = Jsoup.connect("https://habr.com/ru/feed/").get();

            //Извлекаем список статей
            Elements newsParent = doc
                    .select("article.tm-articles-list__item");

            //Выводим 10 статей в консоль
            for(int i = 0; i < 5; i++){
                    System.out.println("Тема: " +
                            //((Element) nodes.get(i))
                            newsParent.get(i)
                                    .getElementsByClass("tm-title tm-title_h2").select("a.tm-title__link span").text());
                    System.out.println("Хаб: " +
                            //((Element) nodes.get(i))
                            newsParent.get(i)
                                    .getElementsByClass("tm-publication-hubs__container").select("a.tm-publication-hub__link span").text() +
                            "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
