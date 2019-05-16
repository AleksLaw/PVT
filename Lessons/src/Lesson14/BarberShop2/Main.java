package Lesson14.BarberShop2;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            BarberShop barberShop = new BarberShop();
            List<Parfume> initialParfumes = List.of(
                    new Parfume("p1"),
                    new Parfume("p2"),
                    new Parfume("p3"),
                    new Parfume("p4"),
                    new Parfume("p5"),
                    new Parfume("p6"));
            barberShop.addParfumes(initialParfumes);

            barberShop.setOpen(true);

            Thread barberThread1 = new Thread(new Barber(barberShop), "Barber1");
            Thread barberThread2 = new Thread(new Barber(barberShop), "Barber2");
            barberThread1.start();
            barberThread2.start();

            for (int i = 1; i <= 7; i++) {
                Client client1 = new Client();
                client1.setBarberShop(barberShop);
                Thread t = new Thread(client1, "Client" + i);
                Thread.sleep(500);
                t.start();
            }

            Thread.sleep(15000);
            barberShop.setOpen(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}