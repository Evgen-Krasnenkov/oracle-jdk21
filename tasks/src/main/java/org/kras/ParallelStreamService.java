package org.kras;

import java.util.List;

public class ParallelStreamService {
    public static void main(String[] args) {
        var list = List.of("Table", "Chair");
        var result = list.parallelStream()
                .reduce(list.parallelStream()
                                .reduce((l, p) -> l + p)
                                .get(),
                        (n, m) -> n + m,
                        (s, str) -> s.concat(str));
        System.out.println(result);
    }
}
