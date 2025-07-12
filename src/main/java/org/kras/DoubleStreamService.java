package org.kras;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.DoubleSupplier;
import java.util.stream.DoubleStream;


public class DoubleStreamService {
    public static void main(String[] args) {
        DoubleSupplier doubleSupplier = new DoubleSupplier() {
            @Override
            public double getAsDouble() {
                return ThreadLocalRandom.current().nextDouble();
            }
        };

        DoubleStream values = DoubleStream.generate(doubleSupplier);

        double value = values
                .sorted()
                .filter(d -> d > 0.4 && d < 0.5)
                .peek(d -> System.out.println("Filtered value: " + d))
                .findFirst()
                .getAsDouble();


        System.out.println(value);
    }
}
