package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        Consumer<Integer> printInteger = System.out::println;

        Stream<String> langs = Stream.of("Java", "Python", "Typescript");
        langs.forEach(print);

        System.out.println("\n-------------------------------");

        String[] maislangs = {"Kotlin", "C", "C++", "Go"};

        Stream.of(maislangs).forEach(print);

        System.out.println("\n-------------------------------");
        Arrays.stream(maislangs).forEach(print);

        System.out.println("\n-------------------------------");
        Arrays.stream(maislangs, 1, 2).forEach(print);

        System.out.println("\n-------------------------------");
        List<String> outrasLangs = Arrays.asList("C#", "PHP", "JavaScript");
        outrasLangs.stream().forEach(print);
        System.out.println("\n-------------------------------");
        outrasLangs.parallelStream().forEach(print);

        System.out.println("\n-------------------------------");
        //Stream.generate(()->"a").forEach(print);
        //Stream.iterate(0, n -> n + 1).forEach(printInteger);
    }
}
