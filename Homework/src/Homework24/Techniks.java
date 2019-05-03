package Homework24;

abstract class Techniks {

    String name;

    abstract boolean on();

    public Techniks(String name) {
        this.name = name;
    }
    interface Wifi {
        void yesWifi();
        void noWifi();

    }

    @Override
    public String toString() {
        return super.toString();
    }

}
