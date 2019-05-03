package Homework24;

public class WaterTehnik extends HeatTechnik implements Techniks.Wifi {

    private boolean waterOn = false;

    public WaterTehnik(String name) {
        super(name);
    }



    public boolean isWaterOn() {
        System.out.println("Емкость заполнена! " + this.name);
        return waterOn=true;
    }

    @Override
    public String toString() {
        return "Нагревательная техника с водой которая называется " + this.name+" 220В="+ this.on +" вода="+ this.waterOn+  " нагрев="+this.heatOn +  " Wifi="+ this.Wifi;
    }
}
