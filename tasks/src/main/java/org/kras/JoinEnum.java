package org.kras;

import java.util.List;
import java.util.stream.Collectors;

public class JoinEnum {
    public static void main(String[] args) {
        String collect = List.of("Hello", "and", "WELCOME")
                .stream()
                .collect(Collectors.mapping(v -> Transformer.transform(v),
                        Collectors.joining(" "))
                );
        System.out.println(collect);
    }
}
