package Lesson8.abstractz.src.by.pvt.abstr;

public interface Playable {

    void playMusic();

    default void playMusic(int money) {
        System.out.println("Play music for money");
    }
}