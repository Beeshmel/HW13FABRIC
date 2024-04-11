package src.abstract_factory;

public class ComboSetSecond extends AbstractFactory {

    @Override
    public Food createFood() {
        return new Food("Пицца");
    }

    @Override
    public Drink createDrink() {
        return new Drink("Чай");
    }
}
