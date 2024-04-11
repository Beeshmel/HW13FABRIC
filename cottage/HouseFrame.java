package cottage;

//import builder.Body;

//import static javax.management.MBeanServerFactory.builder;

public class HouseFrame {

    enum Hull{
        WOODEN,
        CONCRETE,
        BRICK
    }

    enum Level{
        ONE_STORY,
        TWO_STOREY,
        TREE_STOREY
    }

    enum Chimney{
        GAS,
        WOOD_BURNING
    }

    private final HouseFrame.Hull hull;
    private final HouseFrame.Level level;
    private final HouseFrame.Chimney chimney;

    public HouseFrame(Hull hull, Level level, Chimney chimney) {
        this.hull = hull;
        this.level = level;
        this.chimney = chimney;
    }

    @Override
    public String toString() {
        return "Каркас{" +
                "основа коттеджа=" + hull.name() +
                ",количество этажей=" + level.name() +
                ",тип печи=" + chimney.name() +

                '}';
    }
}
