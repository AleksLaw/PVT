package HomeworkSecondBook.Homework1.Test;

public class CashDesk implements Runnable {
    private Line line;
    private Type clientType;

    public CashDesk(Line line, Type clientType) {
        this.line = line;
        this.clientType =clientType;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.currentThread().setName("Затавариваемся "+clientType);

                //Time to load the goods
                Thread.sleep(500);
                Client client = line.get(clientType);
                if(client!=null)
                    while (client.countCheck()){
                        Thread.sleep(100);
                        client.add(10);
                        System.out.println(client.getCount() + " Клиент затаваривается. " + Thread.currentThread().getName());
                    }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}