package cottage;

public class Main {
    public static void main(String[] args) {
        var cottage = new Cottage.Builder()
                .setTitle("Замечательный коттедж в тихом районе с бассейном")
                .setHouseFrame(HouseFrame.Hull.WOODEN, HouseFrame.Level.TWO_STOREY,
                        HouseFrame.Chimney.WOOD_BURNING)
                .setDoor(Door.Lock.TWO_BOLT_LOCK, Door.TypeDoor.STEEL_DOOR, Door.Armored.NOT_ARMORED)
                .setHeating(Heating.HeatPipes.COMBINED)
                .setLight(Light.Lighting.LED, Light.TypeLightning.INBUILT)
                .setWindow(Window.Type.DOUBLE_GLAZING, Window.Style.TILL_TURNED)
                .setPlumbing(Plumbing.Water.COLD_AND_HEAT, Plumbing.Filter.YES)
                .build();
        cottage.settleIn();
//        cottage.settleOut();
        System.out.println(cottage);

    }
}
