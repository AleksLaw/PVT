package HomeworkSecondBook.Homework1.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        Line line = new Line();

        ClientGenerator clientGenerator = new ClientGenerator(line, 10);

        CashDesk cashDesk1 = new CashDesk(line, Type.DRESS);
        CashDesk cashDesk2 = new CashDesk(line, Type.BANANA);
        CashDesk cashDesk3 = new CashDesk(line, Type.MEAL);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        service.execute(clientGenerator);
        service.execute(cashDesk1);
        service.execute(cashDesk2);
        service.execute(cashDesk3);

        service.shutdown();
    }
}
