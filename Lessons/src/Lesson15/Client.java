package Lesson15;

public class Client {
    private Waiter waiter;

    public Client(Waiter waiter) {
        this.waiter = waiter;
    }

    public Waiter getDone1() {
        waiter.getWaiterName(1);
        waiter.doSomething();
        return waiter;
    }

    public Waiter getDone2() {
        waiter.getWaiterName(2);
        waiter.doSomething();
        return waiter;
    }
}
