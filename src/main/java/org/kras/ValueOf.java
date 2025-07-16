package org.kras;

/*
What is the result?
O 1
-128
0
• Exception is thrown at run time
-1
128
 */
public class ValueOf {
    public static void main(String[] args) {
        int x = Integer.valueOf("a", 16) - 9;
        String y = "128";
        String xBoolean = String.valueOf(x);
        byte z = Boolean.valueOf(xBoolean) ? Integer.valueOf(y).byteValue() : (byte) x;
        System.out.println(z);
    }
}
