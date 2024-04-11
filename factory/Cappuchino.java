package factory;

public class Cappuchino extends Coffee{
    Cappuchino(){
        grindCoffee();
        makeCoffee();
        passCoffee();
    }


    public void makeCoffee(){
        super.makeCoffee();
        System.out.println("Добавление молока...");
    }

}
