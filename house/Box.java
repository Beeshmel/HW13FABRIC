package house;

public class Box {

    private final Enum.MaterialBox MATERIAL; // материал стен
    private boolean isWarming; // утепление

    public Box(Enum.MaterialBox material) {
        this.MATERIAL = material;
    }

    public Box(Enum.MaterialBox material, boolean isWarming) {
        this.MATERIAL = material;
        this.isWarming = isWarming;
    }

    @Override
    public String toString() {
        return "стены: материал - " + MATERIAL + "; утепление - " + isWarming;
    }

}
