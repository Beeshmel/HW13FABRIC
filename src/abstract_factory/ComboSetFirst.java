package src.abstract_factory;

public class ComboSetFirst extends AbstractFactory {

    @Override
    public Food createFood() {
        return new Food("Бургер");
    }

    @Override
    public Drink createDrink() {
        return new Drink("Кофе");
    }
}
