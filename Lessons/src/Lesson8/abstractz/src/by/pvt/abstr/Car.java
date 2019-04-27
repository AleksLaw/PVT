package Lesson8.abstractz.src.by.pvt.abstr;

public class Car extends Auto implements Playable {

    @Override
    public void playMusic() {
        System.out.printf("Auto is playing music");
    }

}