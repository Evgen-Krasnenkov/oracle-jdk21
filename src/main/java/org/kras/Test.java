package org.kras;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.read("acme.txt");
    }

    public void read(String fileName) {
        String data = null;
        try {
            Path path = Path.of(fileName);
            openFile(path);
            data = readData(path);
        } catch (NoSuchFileException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong");
            return;
        } finally {
            System.out.println("Cleanup");
            System.out.println("Data acquired: " + data);
        }
    }

    public void openFile(Path path) throws IOException {
        if (!Files.exists(path)) {
            throw new NoSuchFileException("File not found");
        }
    }

    public String readData(Path path) throws IOException {
//        throw new IOException("Not implemented");
        return Files.lines(path)
                .collect(() -> new StringBuilder(),
                        (stringBuilder, str) -> stringBuilder.append(str),
                        (stringBuilder1, s) -> stringBuilder1.append(s))
                .toString();
    }
}