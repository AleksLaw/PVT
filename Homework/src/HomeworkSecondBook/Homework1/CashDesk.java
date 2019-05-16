package HomeworkSecondBook.Homework1;

public class CashDesk implements Runnable {
    private Queue queue;
    private String name;

    public CashDesk(Queue queue, String name) {
        this.queue = queue;
        this.name = name;
    }

    @Override
    public void run() {

        try {
            while (queue.getSize() != 0) {
                Client qw = queue.getQ();
                System.out.println(name + "  Клиент " + Thread.currentThread().getName() + " РАССЧИТЫВАЕТСЯ за " + qw.getProduct());
                queue.delQueue(qw);
                Thread.sleep(0);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
