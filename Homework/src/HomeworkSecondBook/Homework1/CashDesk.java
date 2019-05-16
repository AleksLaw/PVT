package HomeworkSecondBook.Homework1;

public class CashDesk implements Runnable {
    private Queue queue;
    private String name;


    public CashDesk(Queue queue, String name) {
        this.queue = queue;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {


        try {
            while (queue.getSize() != 0) {
                Client qw = queue.getQ();
                System.out.println("CashDesk: " + name + "  Клиент " + qw.toString() + " РАССЧИТЫВАЕТСЯ за " + qw.getProduct() + "     " + Thread.currentThread().getName());
                queue.delQueue(qw);
                Thread.sleep(400);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
