package Lesson7.module1.src.by.pvt.string.example;

public class StringDemo {


    public static void main(String[] args) {
        String s1 = "test";
        String s2 = "test";
        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1.equals(s2) " + s1.equals(s2));

        String s3 = new String("test");
        System.out.println("s1 == s3 " + (s1 == s3));
        System.out.println("s1.equals(s3) " + s1.equals(s3));

        s3 = s3.intern();
        System.out.println("s1 == s3 " + (s1 == s3));
        System.out.println("s1.equals(s3) " + s1.equals(s3));


        String s4 = "c";
        String s5 = "с";
        System.out.println("s4.equals(s5) " + s4.equals(s5));

    }

}