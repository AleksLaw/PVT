package HomeworkSecondBook.Homework1;

import java.util.ArrayList;

public  class  Queue {
    private ArrayList queue;


    public Queue() {
        this.queue = new ArrayList();
        System.out.println("Создалась очередь");
    }

    public  void addQueue (Client client){
        queue.add(client);
        System.out.println("Client:" +client.toString() + " ВСТАЛ в очередь   "+Thread.currentThread().getName ( ) );

    }

    public synchronized Client getQ (){
        return (Client) queue.get(0);
    }


    public synchronized ArrayList delQueue (Client client){
        if (queue.size()!=0) {
            queue.remove(0);
        }
        System.out.println("Client:" +client.toString() + " УШЕЛ из мазагина   "+Thread.currentThread().getName ( ));
        return queue;
    }

    public synchronized int getSize (){
        return queue.size();
    }

}
