package Homework25;

public class RFidTehnologue extends DebitCreditCard {

    protected boolean RFid = false;

    public RFidTehnologue(String type) {
        super(type);
    }

    public boolean onRFid() {
        if (RFid == true) {
            System.out.println("Безконтактная карта! " + this.RFid);
        } else System.out.println("Карта без чипа RFid! " + this.RFid);

        return RFid = true;
    }

    @Override
    public String toString() {
        return "Карта типа " +type + " RFid=" + RFid + " credit=" + credit ;
    }
}
