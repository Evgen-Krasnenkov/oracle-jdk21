package org.kras;

public class SoutHelloJava {
    public static void main(String[] args) {
        String a = "Hello! Java";
        int startIndexOfJava = a.indexOf("Java");// 7
        System.out.println(startIndexOfJava);
        String replace = a.replace("Hello!", "Welcome!");
        int newIndex = a.indexOf("Java");//9
        System.out.println(newIndex);
        StringBuilder b = new StringBuilder(a);
        int i = b.indexOf("Java");//9^
        System.out.println(i);

    }
}
