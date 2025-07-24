package org.kras;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class SortedStream {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Test");
        Stream<String> s1 = Stream.of("A", "B", "C", "B");
        Stream<String> s2 = Stream.of("A", "D", "E");
        Stream.concat(s1, s2)
                .parallel()
                .distinct()
                .sorted() // sorts only with forEachOrdered
                .forEach(e -> logger.log(Level.INFO, e));

    }
}
