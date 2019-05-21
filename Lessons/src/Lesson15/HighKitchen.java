package Lesson15;

public class HighKitchen implements Waiter {

    @Override
    public void doSomething() {
        System.out.println("High Kitchen: do exclusive dish");
    }

    @Override
    public String getWaiterName(int number) {
        return "No name";
    }

    public void doHighKitchen() {
        System.out.println("High Kitchen");
    }
}