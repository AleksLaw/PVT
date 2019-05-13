package Homework21_30.Homework24;

abstract class Techniks {

    String name;


    abstract boolean on();

    public Techniks(String name) {
        this.name = name;
    }

    interface Wifi {
        boolean Wifi();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
