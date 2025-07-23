package org.kras;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamService {
    static Predicate<Integer> isEven = new Predicate<Integer>() {
        @Override
        public boolean test(Integer n) {
            return n % 2 == 0;
        }
    };
    static Predicate<Integer> isThree = new Predicate<Integer>() {
        @Override
        public boolean test(Integer i) {
            return i % 3 == 0;
        }
    };

    public static void main(String[] args) {
        Stream.of(3, 6, 9, 12, 15, 18, 21, 24, 27)
                .takeWhile(isThree) // take elements in until true
                .dropWhile(isEven) // rejects elements in until true
                .limit(3)
                .forEach(s -> System.out.println(s));
    }

}
