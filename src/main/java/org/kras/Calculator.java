package org.kras;

public class Calculator {
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

    public static void main(String[] args) {
        System.out.println("Test Option 1:");
        testOption1();

        System.out.println("\nTest Option 2:");
        testOption2();

        System.out.println("\nTest Option 3:");
        testOption3();

        System.out.println("\nTest Option 4 (✅ Correct):");
        testOption4();
    }

    static void testOption1() {
        Calculator cal = new Calculator();
        var a = "ACME";
        var b = cal.calc(a);                          // 4 / 2f = 2.0
        var c = cal.calc(Math.round(b));              // calc(2) = 2 / 2f = 1.0
        var d = cal.calc(Math.round(c), a);           // calc(1, "ACME") = 4 + 1 = 5
        var e = cal.calc(d, d);                       // calc(5, 5) = 25
        System.out.println(c + " " + d + " " + e);    // Output: 1.0 5 25
    }

    static void testOption2() {
        Calculator cal = new Calculator();
        var a = "ACME";
        var b = cal.calc(a);                          // 2.0
        var c = cal.calc(Math.round(b));              // 1.0
        var d = cal.calc(Math.round(c), a);           // 1 + 4 = 5
        var e = cal.calc(d, a);                       // calc(5, "ACME") = 4 + 5 = 9
        System.out.println(c + " " + d + " " + e);    // Output: 1.0 5 9
    }

    static void testOption3() {
        Calculator cal = new Calculator();
        var a = "ACME";
        var b = cal.calc(a);                                   // 2.0
        var c = cal.calc(Math.round(b), Math.round(b));        // 2 * 2 = 4
        var d = cal.calc(c, c);                                // 4 * 4 = 16
        var e = cal.calc(Math.round(b), a);                    // 2 + 4 = 6
        System.out.println(c + " " + d + " " + e);             // Output: 4 16 6
    }

    static void testOption4() {
        Calculator cal = new Calculator();
        var a = "ACME";
        var b = cal.calc(a);                          // 2.0
        var c = cal.calc(Math.round(b), a);           // 2 + 4 = 6
        var d = cal.calc(Math.round(c));              // 6 / 2f = 3.0
        var e = cal.calc(c, c);                       // 6 * 6 = 36
        System.out.println(c + " " + d + " " + e);    // ✅ Output: 6 3.0 36
    }
}
