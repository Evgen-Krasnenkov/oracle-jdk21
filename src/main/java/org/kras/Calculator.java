package org.kras;
/*
Which code fragment inserted at line marked "Line n1" would result in the following output: 6 3.0 36?
 */
public class Calculator {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        var a = "ACME";
        float b = cal.calc(a);
        //Line n1
        var c = cal.calc(Math.round(b), a);
        var d = cal.calc(Math.round(c));
        var e = cal.calc(c, c) ;
        System.out.println(c + " " + d + " " + e);
    }

    int calc(int i, String s) {
        return s.length() + i;
    }

    int calc(int i, int j) {
        return i * j;
    }

    float calc(String s) {
        return s.length() / 2f;
    }

    float calc(int i) {
        return i / 2f;
    }
}
