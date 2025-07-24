package org.kras;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamConcat {
    public static void main(String[] args) {
        Stream<String> melody1 = Stream.of("E", "G", "A");
        Stream<String> melody2 = Stream.of("D", "C", "F");
        var value = Stream
                .concat(melody1, melody2)
                .reduce(new BinaryOperator<String>() {
                    @Override
                    public String apply(String a, String b) {
                        return b + a;
                    }
                })
                .get();
        System.out.println(value);
    }
}
