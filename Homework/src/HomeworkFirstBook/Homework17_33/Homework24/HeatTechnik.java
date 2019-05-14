package HomeworkFirstBook.Homework17_33.Homework24;

public class HeatTechnik extends Techniks implements Techniks.Wifi {


    protected boolean heatOn = false;
    protected boolean Wifi = false;
    protected boolean on = false;


    public boolean isHeatOn() {
        System.out.println("Нагрев включен! " + this.name);
        return heatOn = true;
    }


    public HeatTechnik(String name) {
        super(name);
    }

    @Override
    boolean on() {
        System.out.println("Есть питание 220В!! " + this.name);
        return on = true;
    }

    @Override
    public boolean Wifi() {
        System.out.println(this.name + " Может включаться по WiFi");
        return Wifi = true;
    }

    @Override
    public String toString() {
        return "Нагревательная техника которая называется " + this.name + " 220В=" + this.on + " нагрев=" + this.heatOn + " Wifi=" + this.Wifi;
    }


}
