package Lesson8.annotatation.src.by.pvt.annot;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface Nullable {

    String description();
}