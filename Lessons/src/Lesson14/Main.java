package Lesson14;

import java.util.List;

public class Main {
    public static void main(String[] args) {
BarberShop barberShop =new BarberShop();
List <Parfume> initialParfumes =List.of(
        new Parfume("p1"),
        new Parfume("p2"),
        new Parfume("p3"));
barberShop.addParfumes(initialParfumes);
Barber barber =new Barber(barberShop);
Thread barberThred =new Thread();
barberThred.start();
Client client1 = new Client();
new Thread(client1).start();
    }
}
