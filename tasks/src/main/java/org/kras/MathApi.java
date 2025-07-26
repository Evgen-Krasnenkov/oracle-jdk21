package org.kras;
/*
• A runtime exception is thrown
 2
-1
0
1
 */
public class MathApi {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 2;
        if (Math.round(b / c) < b / c & b != b / ++a) {
            c += a++ + b;
        } else {
            c -= --b + a;
        }
        System.out.println(c);
    }
}
