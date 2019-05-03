package Lesson8.annotatation.src.by.pvt.annot;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

       /**
     *
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})
    public @interface FirstAnnotation {

        final static int version = 1;

        String info = "info";

        String getInfo();

        int getVersion();
}