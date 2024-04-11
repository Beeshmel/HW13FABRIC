package cottage;


public class Window {

    enum Type{
        DOUBLE_GLAZING,
        TRIPLEX
    }

    enum Style {
        DOUBLE_HUNG,
        SINGLE_HUNG,
        CASEMENT,
        SLIDER,
        BAY_BOW,
        TILL_TURNED
    }

    private final Type type;
    private final Style style;

    public Window(Type type, Style style) {
        this.type = type;
        this.style = style;
    }

    public Type getType() {
        return type;
    }

    public Style getStyle() {
        return style;
    }

    public String toString() {
        return "Окна{" +
                "тип окон=" + type.name() +
                ", стиль окон:" + style.name();
    };
}
