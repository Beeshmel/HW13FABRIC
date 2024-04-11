package cottage;

public class Door {
    private final Lock lock;//Замок
    private final TypeDoor typeDoor;//тип двери
    private final Armored armored;//Бронированная, да, нет

    enum Lock{
        TWO_BOLT_LOCK,
        TREE_BOLT_LOCK,
        ARMORED_SAFE_LOCK
    }

    enum TypeDoor{
        WOODEN_DOOR,
        STEEL_DOOR,
        HEAVY_STEEL_DOOR,
        FORGED_STEEL_DOOR
    }

    enum Armored{
        NOT_ARMORED,
        BULLET_PROOF_MK1,
        HEAVY_ANTIFRAG_ARMOR_MK3,
        SAFE_BANK_ARMORED
    }

    public Door(Lock lock, TypeDoor typeDoor, Armored armored) {
        this.lock = lock;
        this.typeDoor = typeDoor;
        this.armored = armored;
    }

    public Lock getLock() {
        return lock;
    }

    public TypeDoor getTypeDoor() {
        return typeDoor;
    }

    public Armored getArmored() {
        return armored;
    }

    public void open(){
        System.out.println("Дверь открыта");
    }

    public void close(){
        System.out.println("Дверь закрыта");
    }

    @Override
    public String toString() {
        return "Дверь{" +
                "замок=" + lock +
                ", тип двери=" + typeDoor +
                ", бронированная=" + armored +
                '}';
    }
}
