package Lesson2;

public class Person {

    char sex = 'M';

    String name;

    byte age = 034;

    int heightInCm = 60;

    long cells = 100_000_000;

    boolean isAlive; //false


    public Person() {
        isAlive = true;
        System.out.println("Call Person()");
    }

    public Person(String name) {
        this();
        this.name = name;
        System.out.println("Call Person(String name)");
    }



    public void personGrowUp() {
        heightInCm = heightInCm + 5;
    }


}