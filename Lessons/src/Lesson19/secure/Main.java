package Lesson19.secure;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);

        try {
            Class singletonClass = Class.forName("by.pvt.secure.Singleton");
            Constructor constructor = singletonClass.getDeclaredConstructors()[0];
            AccessibleObject.setAccessible(new Constructor[]{constructor}, true);
            Singleton singleton3 = (Singleton) constructor.newInstance();
            System.out.println(singleton3);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}