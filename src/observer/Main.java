package src.observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        var itemFirst = new Item("Java для начинающих","Содержимое ролика...");
        var itemSecond = new Item("Java для профессионалов","В этом ролике....");
        var items = new ArrayList<Item>();
        Collections.addAll(items,itemFirst,itemSecond);

        var youtubeChannel = new Subject("Блог программиста",items);
        var youtubeChannel2 = new Subject("Блог админа",items);
        var observer = new Observer("Вася");
        var observer2 = new Observer("Анна");

        youtubeChannel.addObserver(observer);
        youtubeChannel.addObserver(observer2);

        youtubeChannel2.addObserver(observer);//Подписали Васю на второй канал
        youtubeChannel.addItem(new Item("Основы Kafka","В данном видео содержится..."));



        youtubeChannel.removeObserver(observer2);
    }
}
