package Lesson14.BarberShop2;

public class Barber implements Runnable {

    private BarberShop barberShop;

    public Barber(BarberShop barberShop) {
        this.barberShop = barberShop;
    }

    @Override
    public void run() {
        try {
            do {
                if (barberShop.isOpen() && !barberShop.isParfumeEmpty()) {
                    barberShop.makeHairDress();
                } else return;
            } while (true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}