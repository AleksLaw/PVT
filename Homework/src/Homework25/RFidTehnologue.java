package Homework25;

public class RFidTehnologue extends DebitCreditCard  {

    private boolean onRFid = false;
    private boolean offRFid = false;

    public RFidTehnologue(String name) {
        super(name);
    }

    public boolean onRFid() {
        if (this.onRFid==true){
            this.offRFid=false;
        }
        System.out.println("Безконтактная карта! " + this.onRFid);
        return true;
    }

    public boolean offRFid() {
        if (this.offRFid == true) {
            this.onRFid = false;
        }System.out.println("Карта без чипа RFid! " + this.offRFid);
    return true;

    }
}
