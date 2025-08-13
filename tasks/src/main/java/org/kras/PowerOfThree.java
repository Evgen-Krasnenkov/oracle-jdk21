package org.kras;

public class PowerOfThree {
    public static void main(String[] args) {
        boolean powerOfThree = isPowerOfThree(45);
        System.out.println(powerOfThree);
    }
    public static boolean isPowerOfThree(int n) {
        String base3 = Integer.toString(n, 3);
        if (n == 0) return true;
        if (n == 1) return false;
        if (n % 3 != 0) return false;
        return isPowerOfThree(n / 3);
    }
}
