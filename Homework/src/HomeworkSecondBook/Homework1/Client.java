package HomeworkSecondBook.Homework1;

public class Client implements Runnable{
    private String name;
    private String product;
    private Queue queue;

    public Client(String name, String product, Queue queue) {
        this.name = name;
        this.product = product;
        this.queue = queue;
    }

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void run() {
        queue.addQueue(this);

    }
}