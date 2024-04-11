package cottage;

/*
Создать билдер коттеджа на примере билдера автомобиля
 */

public class Cottage {

    private final HouseFrame houseFrame;
    private final Door door;
    private final Heating heating;
    private final Light light;
    private final Plumbing plumbing;
    private final Window window;


    private final String title;
    private boolean inhabited = false;

    public Cottage(HouseFrame houseFrame, Door door, Heating heating,
                   Light light, Plumbing plumbing, Window window, String title) {
        this.houseFrame = houseFrame;
        this.door = door;
        this.heating = heating;
        this.light = light;
        this.plumbing = plumbing;
        this.window = window;
        this.title = title;
    }

    public HouseFrame getHouseFrame() {
        return houseFrame;
    }

    public Door getDoor() {
        return door;
    }

    public Heating getHeating() {
        return heating;
    }

    public Light getLight() {
        return light;
    }

    public Plumbing getPlumbing() {
        return plumbing;
    }

    public Window getWindow() {
        return window;
    }

    public String getTitle() {
        return title;
    }

    public boolean isInhabited() {
        return inhabited;
    }

    public void settleIn(){
        if(!inhabited){
            door.open();
            light.on();
            heating.working();
            plumbing.work();
            inhabited = true;
        }
    }

    public void settleOut(){
        if(inhabited){
            door.close();
            light.off();
            heating.off();
            plumbing.closed();
            inhabited = false;
        }
    }

    @Override
    public String toString() {
        return "Коттедж " + title + " состоит из:" +
                "\n" + houseFrame +
                "\n" + door +
                "\n" + window +
                "\n" + light +
                "\n" + heating +
                "\n" + plumbing +
                "\n" + (inhabited ? "Дом заселен" : "В доме никого нет");

    }

    static class Builder{
        private String title;
        private HouseFrame houseFrame;
        private Door door;
        private Heating heatingH;
        private Light light;
        private Window window;
        private Plumbing plumbing;



        public Cottage.Builder setTitle(String title){
            this.title = title;
            return this;
        }

        public Cottage.Builder setHouseFrame(HouseFrame.Hull hull,
                                             HouseFrame.Level level, HouseFrame.Chimney chimney){
            houseFrame = new HouseFrame(hull,level,chimney);
            return this;
        }
        public Cottage.Builder setDoor(Door.Lock lock, Door.TypeDoor typeDoor, Door.Armored armored){
            door = new Door(lock,typeDoor,armored);
            return this;
        }

        public Cottage.Builder setLight(Light.Lighting lighting, Light.TypeLightning typeLightning){
            light = new Light(lighting,typeLightning);
            return this;
        }

        public Cottage.Builder setHeating(Heating.HeatPipes heating){
            heatingH = new Heating (heating);
            return this;
        }

        public Cottage.Builder setPlumbing(Plumbing.Water water, Plumbing.Filter filter){
            plumbing = new Plumbing(water,filter);
            return this;
        }

        public Cottage.Builder setWindow(Window.Type type, Window.Style style){
            window = new Window(type,style);
            return this;
        }


        /**
         * Получаем готовый коттедж
         * @return
         */
        public Cottage build(){
            if(title == null){
                title = "Basic cottage";
            }
            return new Cottage(houseFrame,door,heatingH,light,plumbing,window,title);
        }
    }
}
