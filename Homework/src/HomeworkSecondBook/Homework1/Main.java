package HomeworkSecondBook.Homework1;

public class Main {
   public static void main(String[] args) {
       CashDesk c1 =new CashDesk();
       Buyer b1 = new Buyer("B1", new String[]{"хлеб", "молоко"},new String[] {"c1"});
       c1.buyProduckt(b1 , "c1");
    }
}
