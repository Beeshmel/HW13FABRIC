package cottage;

public class Light { // освещение

    enum Lighting{
        LUMINESCENCE,
        LED
    }

    enum TypeLightning {
        HANGING,
        INBUILT

    }

    private final Lighting lighting;//Освещение
    private final TypeLightning typeLightning;//тип светильников

    public Light(Lighting lighting, TypeLightning typeLightning) {
        this.lighting = lighting;
        this.typeLightning = typeLightning;
    }

    public Lighting getLighting() {
        return lighting;
    }

    public TypeLightning getTypeLightning() {
        return typeLightning;
    }

    public void on(){
        System.out.println("Свет включен");
    }

    public void off(){
        System.out.println("Свет выключен");
    }

    @Override
    public String toString() {
        return "Освещение{" +
                "свет=" + lighting +
                ", тип светильников=" + typeLightning +
                '}';
    }

}
