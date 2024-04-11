package factory;

public class FactoryMethod {
    public static Coffee createCoffee(TypeCoffee typeCoffee){
        switch (typeCoffee){
            case LATTE:
                return new Latte();
            case CAPPUCHINO:
                return new Cappuchino();
            case AMERICANO:
                return new Americano();
        }
        return null;
    }
}
