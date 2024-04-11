package cottage;

public class Plumbing { // водопровод

    enum Water {
        COLD_WATER,
        COLD_AND_HEAT
    }

    enum Filter {
        YES,
        NO
    }

    private final Water water;//Освещение
    private final Filter filter;//тип светильников

    public Plumbing(Water water, Filter filter) {
        this.water = water;
        this.filter = filter;
    }

    public Water getWater() {
        return water;
    }

    public Filter getFilter() {
        return filter;
    }

    public void work(){
        System.out.println("Вода течет");
    }

    public void closed(){
        System.out.println("Водопровод выключен");
    }

    @Override
    public String toString() {
        return "Водопровод{" +
                "вода=" + water +
                ", фильтр=" + filter +
                '}';
    }
}
