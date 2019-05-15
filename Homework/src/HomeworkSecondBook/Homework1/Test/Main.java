package HomeworkSecondBook.Homework1.Test;

import HomeworkSecondBook.Homework1.test2.ClientGenerator;
import HomeworkSecondBook.Homework1.test2.Line;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Available number of cores: " + Runtime.getRuntime().availableProcessors());

        Line line = new Line();

        ClientGenerator clientGenerator = new ClientGenerator(line, 10);

        HomeworkSecondBook.Homework1.Test.CashDesk cashDesk1 = new HomeworkSecondBook.Homework1.Test.CashDesk(line, Type.DRESS);
        HomeworkSecondBook.Homework1.Test.CashDesk cashDesk2 = new HomeworkSecondBook.Homework1.Test.CashDesk(line, Type.BANANA);
        HomeworkSecondBook.Homework1.Test.CashDesk cashDesk3 = new CashDesk(line, Type.MEAL);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        service.execute(clientGenerator);
        service.execute(cashDesk1);
        service.execute(cashDesk2);
        service.execute(cashDesk3);

        service.shutdown();
    }
}
