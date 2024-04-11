package src.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String titleSubject;
    private List<Item> items;
    private List<Observer>observerList;

    public String getTitleSubject() {
        return titleSubject;
    }

    public Subject(String titleSubject, List<Item> items) {
        observerList = new ArrayList<>();
        this.titleSubject = titleSubject;
        this.items = items;
    }

    void showItems(){
        for (Item item : items) {
            System.out.println("Название:" + item.getTitle() + ", описание: " + item.getContent());
        }
    }

    /**
     * Добавление подписчика
     * @param observer - подписчик
     */
    public void addObserver(Observer observer){
        observer.addChannel(titleSubject);
        observerList.add(observer);
        System.out.println("Текущий список подписчиков");
        System.out.println(observerList);
    }

    public void removeObserver(Observer observer){
        if(observerList.remove(observer)){
            System.out.println("Пользователь " + observer.getLogin() + " отписался от канала");
        }
        System.out.println("Оставшиеся подписчики:");
        System.out.println(observerList);
    }

    /**
     * Добавление ролика
     */
    void addItem(Item item){
        items.add(item);
        notifyAllObservers(item);
    }

    private void notifyAllObservers(Item item) {
        for(var observer : observerList){
            observer.update("Уважаемый, " + observer.getLogin() + ", на канале "
                    + titleSubject + " вышел ролик " + item.getTitle());
        }
    }
}
