package HomeworkSecondBook.Homework1.test2;

import HomeworkSecondBook.Homework1.Test.CashDesk;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        Line line = new Line();

        ClientGenerator clientGenerator = new ClientGenerator(line, 10);

        HomeworkSecondBook.Homework1.Test.CashDesk cashDesk1 = new HomeworkSecondBook.Homework1.Test.CashDesk(line);
        HomeworkSecondBook.Homework1.Test.CashDesk cashDesk2 = new HomeworkSecondBook.Homework1.Test.CashDesk(line);
        HomeworkSecondBook.Homework1.Test.CashDesk cashDesk3 = new CashDesk(line);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        service.execute(clientGenerator);
        service.execute(cashDesk1);
        service.execute(cashDesk2);
        service.execute(cashDesk3);

        service.shutdown();
    }
}
