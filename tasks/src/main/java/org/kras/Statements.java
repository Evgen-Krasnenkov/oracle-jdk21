package org.kras;

import java.io.ByteArrayOutputStream;
import java.io.Console;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Statements {
    public static void main(String[] args) {
        Console console = System.console();
      //  char[] chars = console.readPassword("Enter password: ");// there is no console in IDEs, so this will not work in IDEs
        // Create a PrintStream that writes to a ByteArrayOutputStream
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = null;
        try {
            ps = new PrintStream(baos, true, "UTF-8");

        // Write characters (PrintStream converts them to bytes)
        ps.print("Hello, Світ!"); // Includes Latin and Cyrillic characters

        // Get the raw bytes written by PrintStream
        byte[] byteData = baos.toByteArray();

        // Create a PrintWriter with UTF-8 encoding
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"), true);

        // Print a string with some Unicode characters
        String message = "Hello, Слава Україні, 😀";
        writer.println("Original message: " + message);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
