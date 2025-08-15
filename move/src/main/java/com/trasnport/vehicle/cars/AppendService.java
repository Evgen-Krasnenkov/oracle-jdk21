package com.trasnport.vehicle.cars;

import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class AppendService {
    public static void main(String[] args) {
        Calculable c1 = new Calculable() {
            @Override
            public long calculate(int i) {
                return i + 1;
            }
        };

        Calculable c2 = new Calculable() {
            @Override
            public long calculate(int i) {
                return Long.valueOf(i);
            }
        };

        Calculable c3 = new Calculable() {
            @Override
            public long calculate(int i) {
                throw new ArithmeticException("It is an easy exception");
            }
        };
        StringBuilder result = Stream.of( "a", "b" )
                .parallel()
                .collect(
                        new Supplier<StringBuilder>() {
                            @Override
                            public StringBuilder get() {
                                return new StringBuilder("c");
                            }
                        },
                        new BiConsumer<StringBuilder, String>() {
                            @Override
                            public void accept(StringBuilder stringBuilder, String str) {
                                stringBuilder.append(str);
                            }
                        },
                        new BiConsumer<StringBuilder, StringBuilder>() {
                            @Override
                            public void accept(StringBuilder a, StringBuilder b) {
                                b.append(a);
                            }
                        }
                );
        StringBuilder builder = new StringBuilder("c");
        StringBuilder a = builder.append(new StringBuilder("a"));
        System.out.println( result );
    }
}
