package factory;

public class Latte extends Coffee{
    Latte(){
        grindCoffee();
        makeCoffee();
        passCoffee();
    }


    public void makeCoffee(){
        super.makeCoffee();
        System.out.println("Добавляем много молока...");
    }

}
