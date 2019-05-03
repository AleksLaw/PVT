package Homework24;

public class HeatTechnik extends Techniks implements Techniks.Wifi {

    boolean heatOn=false;

public boolean isHeatOn (){
    System.out.println("Нагрев включен! " + this.name);
    return true;
}


    public HeatTechnik(String name) {
        super(name);
    }

    @Override
    boolean on() {
        System.out.println("Есть питание 220В!! " + this.name);
        return true;
    }



    @Override
    public void yesWifi() {
        System.out.println(this.name+" Может включаться по WiFi");
    }

    @Override
    public void noWifi() {
        System.out.println(this.name+" Нет WiFi");
    }
}
