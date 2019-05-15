package HomeworkSecondBook.Homework1.Test;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private List<Client> store;
    private static final int maxBuyersInLine = 3;
    private static final int minBuyersInLine = 0;
    private int clientCounter = 0;

    public Line() {
        store = new ArrayList<>();
    }

    public synchronized boolean add(Client element) {

        try {
            if (clientCounter < maxBuyersInLine) {
                notifyAll();
                store.add(element);
                String info = String.format("%s + Клиент пришел в очередь: %s %s %s", store.size(), element.getType(), element.getSize(), Thread.currentThread().getName());
                System.out.println(info);
                clientCounter++;

            } else {
                System.out.println(store.size() + "> Очередь полная: " + Thread.currentThread().getName());
                wait();
                return false;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    public synchronized Client get(Type clientType) {

        try {
            if (clientCounter > minBuyersInLine) {
                notifyAll();
                for (Client client : store) {
                    if (client.getType() == clientType) {
                        clientCounter--;
                        System.out.println(store.size() + "- Клиент покинул очередь: " + Thread.currentThread().getName());
                        store.remove(client);
                        return client;
                    }
                }
            }

            System.out.println("0 < В очереди нет клиентов");
            wait();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
