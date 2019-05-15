package HomeworkSecondBook.Homework1;

public class CashDesk {
    public String getCashDeskName() {
        return cashDeskName;
    }

    private String cashDeskName;

    public void buyProduckt(Buyer buyer, String cashDeskName){
        for (int i =0; i<  buyer.getProduct().length; i++) {
            System.out.println(buyer.getNameBuyer() +"  купил  "+    buyer.getProduct() [i]   +" в кассе   " + cashDeskName );
        }
    }
}

