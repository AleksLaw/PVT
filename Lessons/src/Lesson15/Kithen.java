package Lesson15;

public class Kithen implements Waiter {

    @Override
    public void doSomething() {
        System.out.println("Kitchen: Do meal");
    }

    @Override
    public String getWaiterName(int number) {
        return "Mr. Smith";
    }

    @Override
    public String myName() {
        return null;
    }
}
