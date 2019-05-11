package Homework24;
//Задание
// Создать иерархию классов для бытовой техники Создать несколько объектов
// и включить их в розетку

public class Main {
    public static void main(String[] args) {
        WaterTehnik electricKettle = new WaterTehnik("Electric kettle");
        electricKettle.on();
        electricKettle.isWaterOn();
        electricKettle.isHeatOn();
        electricKettle.Wifi();
        System.out.println(electricKettle);
        WaterTehnik dishwasher = new WaterTehnik("Dishwasher");
        dishwasher.on();
        dishwasher.isWaterOn();
        dishwasher.isHeatOn();
        System.out.println(dishwasher);
        HeatTechnik cooker = new HeatTechnik("Cooker");
        cooker.on();
        cooker.isHeatOn();
        cooker.Wifi();
        System.out.println(cooker);


    }
}
