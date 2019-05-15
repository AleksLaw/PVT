package Lesson14;

public class Barber implements Runnable{
    private BarberShop barberShop;
    public Barber(BarberShop barberShop) {
        this.barberShop = barberShop;
    }

    @Override
    public void run() {
        try {
            barberShop.setOpen(true);
            System.out.println(barberShop.takeParfume());
            Thread.sleep(10000);
            barberShop.setOpen(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
