package Lesson14;

public class Client implements Runnable {
    private BarberShop barberShop;

    public void setBarberShop(BarberShop barberShop) {
        this.barberShop = barberShop;
    }

    @Override
    public void run() {

        try {
            do {
                if (barberShop.isOpen()){
                    barberShop.newClient();
                }else {
                    System.out.println("Client: Barber Shop is close");
                }
                Thread.sleep(3000);
            } while (true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
