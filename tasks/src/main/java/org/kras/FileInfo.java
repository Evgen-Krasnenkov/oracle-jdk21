package org.kras;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileInfo {
    public static void main(String[] args) {

        try (Stream<Path> paths = Files.list(Paths.get("/Users/Yevgenii_Krasnenkov/mate/oracle-jdk21/tasks/src/main/resources"))) {
            List<String> collect = paths
                    .filter(p -> Files.isRegularFile(p) &&
                            p.toString().endsWith("txt"))
                    .flatMap(p -> {
                        try {
                            return Files.lines(p);
                        } catch (IOException e) {
                            return null;
                        }
                    })
                    .collect(Collectors.toList());
            Integer i = collect.stream()
                    .filter(s -> s.contains("!"))
                    .map(s -> s.indexOf("?"))// index of "?" returns -1 if not found
                    .reduce((a, b) -> a + b)
                    .get();
            System.out.println(i);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
