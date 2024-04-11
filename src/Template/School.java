package src.Template;

public class School extends Education{

    @Override
    protected void getDocument() {
        System.out.println("Получаем аттестат о среднем образовании");
    }

    @Override
    protected void study() {
        System.out.println("Посещаем уроки и делаем ДЗ");
    }

    @Override
    protected void enter() {
        System.out.println("Поступление без экзаменов");
    }
}
