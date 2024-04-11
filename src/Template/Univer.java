package src.Template;

public class Univer extends Education{

    @Override
    protected void getDocument() {
        System.out.println("Получаем диплом");
    }

    @Override
    protected void study() {
        System.out.println("Посещаем лекции и практику");
    }

    @Override
    protected void enter() {
        System.out.println("Поступление при успешной сдаче экзаменов");
    }
}
