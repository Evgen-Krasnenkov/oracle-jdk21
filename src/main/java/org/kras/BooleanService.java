package org.kras;

public class BooleanService {
    public static void main(String[] args) {
        int a = 2;
        int b = ~a;
        int c = a ^ b;
        boolean d = a < b & a > c++;
        System.out.println(d + " " + c);

        boolean e = a > b && a > c + 1;
        System.out.println(e + " " + c);
    }
}
