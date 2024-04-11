package house;

public class House {
    private final Box BOX; // коробка дома
    private final Roof ROOF; // крыша дома
    private final Foundation FOUNDATION; // фундамент дома
    private String title; // название проекта
    private boolean isBuild;  // дом не построен

    public House(String title, Box box, Roof roof, Foundation foundation) {
        this.title = title;
        this.BOX = box;
        this.ROOF = roof;
        this.FOUNDATION = foundation;
    }

    public void isBuildHouse(boolean isBuild) {
        System.out.println(!isBuild ?"Дом ещё строится..." : "Дом построен!");
    }

    static class Builder{
        private String title;
        private Box box;
        private Foundation foundation;
        private Roof roof;

        public Builder setTitle(){
            return this;
        }
        public Builder setTitle(String title){
            this.title = title;
            return this;
        }

        public Builder setBox(Enum.MaterialBox material){
            box = new Box(material);
            return this;
        }

        public Builder setBox(Enum.MaterialBox material, boolean isWarming){
            box = new Box(material, isWarming);
            return this;
        }
        public Builder setFoundation(Enum.TypeFoundation type) {
            foundation = new Foundation(type);
            return this;
        }

        // создание крыши с 3 параметрами
        public Builder setRoof(Enum.ColorsRoof color, Enum.MaterialRoof material, Enum.DesignRoof design){
            roof = new Roof(color, material, design);
            return this;
        }

        // создание крыши со всеми параметрами
        public Builder setRoof(Enum.ColorsRoof color, Enum.MaterialRoof material,
                               Enum.DesignRoof design, boolean isWaterProofing, boolean isWarming){
            roof = new Roof(color, material, design, isWaterProofing, isWarming);
            return this;
        }

        /** Строим дом
         * @return готовый дом
         */
        public House build(){
            if(title == null){
                title = "Типовой дом";
            }
            return new House(title, box, roof, foundation);
        }
    }

    @Override
    public String toString() {
        return "Проект: " +"\nназвание - " + title +
                ";\n" + BOX +
                ";\n" + ROOF +
                ";\n" + FOUNDATION;
    }
}

