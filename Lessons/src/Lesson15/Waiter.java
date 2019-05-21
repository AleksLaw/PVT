package Lesson15;

public interface Waiter {

    void doSomething();

    String getWaiterName(int number);

    default String myName() {
        return "My Name";
    }
}

interface Waiter2 extends Waiter {
    @Override
    default String myName() {
        return null;
    }

    @Override
    void doSomething();

    @Override
    String getWaiterName(int number);
}
