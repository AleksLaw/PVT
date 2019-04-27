package Lesson3.Module1;

import java.util.logging.Logger;

/**
 *
 */
public class Car {

    int mileage = 0;

    boolean isServiceNeeded;

    public void driveForward() {
        mileage++;
        //mileage = mileage + 1;
        System.out.println("Mileage=" + mileage);
    }

    public void driveBackward() {
        mileage--;
        //mileage = mileage - 1;
        System.out.println("Mileage=" + mileage);
    }

    public void checkService() {
        String message;
        message = isServiceNeeded ? "Please go to car service" : "No need service";
        System.out.println(message);
    }

    int gas = 0;

    public void checkGasTank() {
        System.out.println("Gas: " + gas + "L");
    }

    boolean isHandBreakOn;

    Logger log = Logger.getLogger("my.auto.Car");

    public void checkHandBreak() {
        if (isHandBreakOn) {
            if (isServiceNeeded) {
                System.out.println("WARNING! Hand break is ON Please go to Service");
            } else {
                System.out.println("WARNING! Hand break is ON");
            }
        } else {
            //System.out.println("Hand break is OFF");
            log.info("do nothing");
        }
    }

}