package org.kras;
/*
- 1010110
- 10110110
- 0110110
• 0111010
• 1001110
 */
public class BinaryApp {
    public  String x = "01";

    public static void main(String[] args) {
        String x = "10";
        BinaryApp t = new BinaryApp();
        t.myMethod(x);
        System.out.print(x);
    }

    public void myMethod(String x) {
        x += "1";
        System.out.print(x);
        System.out.print(this.x);
    }
}
