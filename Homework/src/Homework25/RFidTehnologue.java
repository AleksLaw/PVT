package Homework25;

public class RFidTehnologue extends DebitCreditCard {

    protected boolean RFid = false;

    public RFidTehnologue(String type) {
        super(type);
    }

    public boolean onRFid(boolean q) {
        if (q == true) {
            System.out.println("Безконтактная карта! " + type);
        } else System.out.println("Карта без чипа RFid! " + type);

        return RFid = q;
    }

    @Override
    public String toString() {
        return "Карта типа " + type + " RFid=" + RFid + " credit=" + credit;
    }
}
