package Lesson15;

public class Main {
    public static void main(String[] args) {
        Waiter waiter = new HighKitchen(); //new HighKitchen(); //

        Client client = new Client(waiter);

        client.getDone1();
        client.getDone2();
    }
}
