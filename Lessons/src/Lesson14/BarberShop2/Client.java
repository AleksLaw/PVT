package Lesson14.BarberShop2;

public class Client implements Runnable {

    private BarberShop barberShop;

    public void setBarberShop(BarberShop barberShop) {
        this.barberShop = barberShop;
    }

    @Override
    public void run() {
        try {
            if (barberShop.isOpen()) {
                barberShop.newClient();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}