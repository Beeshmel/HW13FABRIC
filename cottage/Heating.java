package cottage;

public class Heating { //отопление

    enum HeatPipes{
        STEEL,
        PLASTIC_PP,
        COMBINED
    }

    private final HeatPipes heating;



    public Heating(HeatPipes heating) {
        this.heating = heating;
    }

    public HeatPipes getHeating() {
        return heating;
    }

    public void working(){
        System.out.println("Отопление работает");
    }

    public void off(){
        System.out.println("Отопление выключено");
    }

    @Override
    public String toString() {
        return "Отопление{" +
                "трубы=" + heating +
                '}';
    }
}
