package house;

public class Enum {

    enum MaterialBox{      // матеариал коробки
        BRICK,              // кирпич
        BLOCKS,      // блоки
        LOG,           //сруб
    }

    enum ColorsRoof { // цвет крыши
        RED,
        GREEN,
        BROWN,
        BLUE
    }
    enum MaterialRoof{      // матеариал крыши
        METAL_TILE,     //металлочерепица
        COMPOSITE,      // композитная черепица
        SOFT,           // мягкая кровля
        PROFNASTIL      // профнастил
    }
    enum DesignRoof{ // конструкция крыши
        FLAT,       // плоская
        PITCHED,     // скатная
        HIP         // вальмовая
    }

    enum TypeFoundation { // тип фундамента
        TAPE,         // ленточный фундамент
        MONOLIT,     // монолитный фундамент
        MADE,        // сборный
        PILE        // свайный
    }

}
