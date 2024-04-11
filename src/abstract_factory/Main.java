package src.abstract_factory;

public class Main {
    public static void main(String[] args) {
        var factory = FactoryMethod.getFactory(1);
        System.out.println("В Ваш заказ входит: " + factory.createFood().getTitle() + " и " + factory.createDrink().getTitle());
    }
}
