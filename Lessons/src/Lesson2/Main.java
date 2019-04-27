package Lesson2;
public class Main {

    public static void main(String[] args) {
        Person man = new Person("Vasia Pupkin");

        System.out.println("isAlive=" + man.isAlive);
        System.out.println("Name=" + man.name);



        System.out.println("Cells=" + man.cells);

        System.out.println("Man age: " + man.age);
        System.out.println("Man height: " + man.heightInCm);
        man.personGrowUp();
        System.out.println("Man height: " + man.heightInCm);

        Person woman = new Person();
        System.out.println("Woman height: " + woman.heightInCm);
    }
}