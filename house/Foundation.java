package house;

public class Foundation {
    private final Enum.TypeFoundation TYPE; // тип фундамента

    public Foundation(Enum.TypeFoundation type) {
        this.TYPE = type;
    }

    @Override
    public String toString() {
        return "фундамент - " + TYPE + ".";
    }
}
