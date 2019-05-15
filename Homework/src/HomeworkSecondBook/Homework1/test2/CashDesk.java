package HomeworkSecondBook.Homework1.test2;


import HomeworkSecondBook.Homework1.Test.Client;

public class CashDesk implements Runnable {
    private Line line;

    public CashDesk(Line line) {
        this.line = line;

    }

    @Override
    public void run() {

        while (true) {
            try {


                //Time to load the goods
                Thread.sleep(400);
                Client client = line.get();
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