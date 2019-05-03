package Homework24;

public class WaterTehnik extends HeatTechnik implements Techniks.Wifi {

    boolean waterOn = false;

    public WaterTehnik(String name) {
        super(name);
    }



    public boolean isWaterOn() {
        System.out.println("Емкость заполнена! " + this.name);
        return true;
    }


}
