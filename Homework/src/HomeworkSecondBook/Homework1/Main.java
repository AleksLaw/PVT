package HomeworkSecondBook.Homework1;
//Задание
// Смоделировать несколько касс работающих одновременно. Покупатели это потоки, потоков может быть больше касс,
// но одновременное обслуживание клиентов не может превышать количества касс. Каждый покаупатель чтото покупает

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

            for (int i = 1; i<40; i++) {
                new Thread(new Client("product" + i, queue)).start();
            }

        new Thread(new CashDesk(queue, "Kassa 1")).start();
        new Thread(new CashDesk(queue, "Kassa 2")).start();
        new Thread(new CashDesk(queue, "Kassa 3")).start();

    }
}