package house;

public class Main {

    public static void main(String[] args) {
        House myHouse = new House.Builder().
                setTitle("первый вариант").
                setBox(Enum.MaterialBox.BLOCKS, true).
                setRoof(Enum.ColorsRoof.GREEN, Enum.MaterialRoof.METAL_TILE, Enum.DesignRoof.FLAT).
                setFoundation(Enum.TypeFoundation.MONOLIT).build();
        myHouse.isBuildHouse(true);
        System.out.println(myHouse.toString());

        System.out.println("-----------------------------------------");
        House myHouse2 = new House.Builder().
                setTitle("второй вариант").
                setBox(Enum.MaterialBox.LOG).
                setRoof(Enum.ColorsRoof.RED, Enum.MaterialRoof.COMPOSITE,
                        Enum.DesignRoof.PITCHED, true, false).
                setFoundation(Enum.TypeFoundation.MADE).build();
        myHouse2.isBuildHouse(false);
        System.out.println(myHouse2.toString());

        System.out.println("-----------------------------------------");
        House myHouse3 = new House.Builder().
                setTitle().
                setBox(Enum.MaterialBox.BRICK).
                setRoof(Enum.ColorsRoof.BROWN, Enum.MaterialRoof.SOFT, Enum.DesignRoof.HIP).
                setFoundation(Enum.TypeFoundation.PILE).build();
        myHouse3.isBuildHouse(false);
        System.out.println(myHouse3.toString());
    }
}
