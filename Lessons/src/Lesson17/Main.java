package Lesson17;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            integerList.add(new Random().nextInt(100));
        }
        integerList.add(2, null);
        integerList.forEach(System.out::println);

        Stream<Integer> integerStream = integerList.stream();

        integerStream = integerStream.filter(Objects::nonNull);

        Optional<Integer> optInt = integerStream
                .max(Integer::compareTo);
        System.out.println(optInt);

        Optional<Integer> minInt =  integerList.stream()
                .filter(Objects::nonNull)
                .min(Integer::compareTo);
        System.out.println(minInt);

        System.out.println(integerList.stream()
                .filter(Objects::nonNull)
                .count());

        System.out.println("Sum:" +
                integerList.stream()
                        .filter(Objects::nonNull)
                        .filter(integer -> integer != 0)
                        .reduce((result, element) -> {
                            //System.out.println(result + " " + element);
                            return result + element;
                        }));

        OptionalDouble avg = integerList
                .stream()
                .filter(Objects::nonNull)
                .mapToInt(value -> value)
                .average();
        System.out.println("Avg: " + avg);
    }

    <T> List<? extends T> apply(List<? extends T> value) {
        return value;
    }

    <T> List<? extends T> method(List<? super T> param, T param2) {
        return (List<T>) param;
    }


    int i = 1;

    static int get(Main m) {
        return m.i;
    }
}
