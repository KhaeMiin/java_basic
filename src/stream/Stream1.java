package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] arge) {
        String[] arr = { "J", "AV", "A WOR", "D" };
        Stream<String> strStream = Arrays.stream(arr);
        strStream.forEach(s -> System.out.print(s));
        System.out.println();
        Arrays.<String>stream(arr)
                .forEach(s -> System.out.println(s.replace(" ", "")));
        System.out.println("===============================");
        Objects.requireNonNull(System.out);
        Arrays.stream(new int[] { 1, 3, 5, 6, 4, 12, 3, 4 }).filter(s -> (s < 5)).forEach(System.out::print);
        int[] intArr = { 1, 3, 5, 6, 4, 12, 3, 4 };
        IntStream intStream = Arrays.stream(intArr);
        System.out.println();
        System.out.println("================================");
        IntStream.rangeClosed(1, 6)
                .forEach(a -> System.out.print("" + a + " "));
        System.out.println("");
        IntStream.range(1, 6)
                .forEach(a -> System.out.print("" + a + " "));
        List<String> list = Arrays.asList(new String[] { "c", "o", "l", "l", "e", "c", "t", "i", "o", "n" });
        Objects.requireNonNull(System.out);
        list.stream().map(s -> s.toUpperCase()).forEach(System.out::print);
    }
}