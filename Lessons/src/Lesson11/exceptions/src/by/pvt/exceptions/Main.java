package Lesson11.exceptions.src.by.pvt.exceptions;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();

        try {
            worker.doWork1("");
        } catch (NullPointerException e) {
            System.out.println("Catching NPE");
            e.printStackTrace();
            Worker worker2 = new Worker();

        } catch (MyFirstException e) {
            System.out.println("Catch my exception");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Throwable t) {
            System.out.println("Catch Throwable");
            t.printStackTrace();
        }
        finally {
            System.out.println("Finish call workers");
        }

    }
}
