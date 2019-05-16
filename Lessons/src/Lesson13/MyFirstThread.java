package Lesson13;

public class MyFirstThread extends Thread {

    public MyFirstThread(String name) {
        super(name);
    }

    public MyFirstThread() {
    }

    @Override
    public void run() {
        try {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName()+ " Thread ID=" + thread.getId());
            System.out.println(thread.getName() + " thread.getPriority=" + thread.getPriority());
            System.out.println("thread.getName=" + thread.getName());
            Thread.sleep(5000);
            System.out.println(thread.getName() + " thread.getState().name=" + thread.getState().name());
            System.out.println(thread.getName() + " thread.isDaemon=" + thread.isDaemon());
            System.out.println(thread.getName() + " thread.isAlive=" + thread.isAlive());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
