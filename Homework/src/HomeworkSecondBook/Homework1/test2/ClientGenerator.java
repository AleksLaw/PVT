package HomeworkSecondBook.Homework1.test2;

import HomeworkSecondBook.Homework1.Test.Client;

import java.util.Random;

public class ClientGenerator implements Runnable{
    private Line line;
    private int clientCount;

    public ClientGenerator(Line line, int clientCount) {
        this.line = line;
        this.clientCount = clientCount;
    }

    @Override
    public void run() {
        int count = 0;
        while (count < clientCount) {
            Thread.currentThread().setName(" Появился клиент");
            count++;
            line.add(new Client(getRandomSize()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



    private Size getRandomSize() {
        Random random = new Random();
        return Size.values()[random.nextInt(Size.values().length)];
    }

}
