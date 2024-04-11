package house;

public class Roof {
    private final Enum.ColorsRoof COLOR;
    private final Enum.MaterialRoof MATERIAL;
    private final Enum.DesignRoof DESIGN;
    private boolean isWaterProofing;  // гидроизоляция
    private boolean isWarming; // утепление

    public Roof(Enum.ColorsRoof color, Enum.MaterialRoof material, Enum.DesignRoof design){
        this.COLOR = color;
        this.MATERIAL = material;
        this.DESIGN = design;
    }
    public Roof(Enum.ColorsRoof color, Enum.MaterialRoof material, Enum.DesignRoof design, boolean isWaterProofing, boolean isWarming) {
        this(color, material, design);
        this.isWaterProofing = isWaterProofing;
        this.isWarming = isWarming;
    }

    @Override
    public String toString() {
        return "крыша: материал - " + MATERIAL + "; тип - " + DESIGN + "; цвет - " + COLOR +
                "; гидроизоляция - " + isWaterProofing + "; теплоизоляция - " + isWarming;
    }
}
