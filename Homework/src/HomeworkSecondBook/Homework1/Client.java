package HomeworkSecondBook.Homework1;

public class Client implements Runnable {

    private String product;
    private Queue queue;

    public Client(String product, Queue queue) {
        this.product = product;
        this.queue = queue;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public void run() {
        queue.addQueue(this);
    }
}