package Lesson13;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        try {
            Thread thread = Thread.currentThread();
            System.out.println("Thread ID=" + thread.getId());
            System.out.println("thread.getPriority=" + thread.getPriority());
            System.out.println("thread.getName=" + thread.getName());
            Thread.sleep(5000);
            System.out.println("thread.getState().name=" + thread.getState().name());
            System.out.println("thread.isDaemon=" + thread.isDaemon());
            System.out.println("thread.isAlive=" + thread.isAlive());
        } catch (Exception e) {
            e.printStackTrace();
        }

        new MyFirstThread().start();
        new MyFirstThread("name2").start();
        new MyFirstThread("name3").start();

        new Thread(new MySecondThread()).start();

        try {
            Thread.sleep(5000);
            MySecondThread mySecondThread = new MySecondThread();
            Thread mySecond = new Thread(mySecondThread);
            System.out.println(mySecond.getState().name());
            mySecond.start();
            Thread.sleep(5000);
            System.out.println(mySecond.getState().name());
            mySecond.stop();
            Thread.sleep(5000);
            System.out.println(mySecond.getState().name());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}