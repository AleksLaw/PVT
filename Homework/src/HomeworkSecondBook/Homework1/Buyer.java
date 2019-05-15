package HomeworkSecondBook.Homework1;

public class Buyer implements Runnable{
  private String nameBuyer;
  private int count;
  private String [] product;
  private String [] cashDesk;

  public Buyer(String nameBuyer, String[] product, String[] cashDesk) {
    this.nameBuyer = nameBuyer;
    this.product = product;
    this.cashDesk = cashDesk;
  }

  public String getNameBuyer() {
    return nameBuyer;
  }

  public String[] getProduct() {
    return product;
  }

  public String[] getCashDesk() {
    return cashDesk;
  }

  @Override
  public void run() {
if (cashDesk.length>0){

}
  }
}
