package org.kras;

public interface IFace {
    public void m1();
    public default  void m2() {
        System.out.println("m2");
        this.m4();
    }
    public static void m3() {
        System.out.println("m3");
    }
    private void m4() {
        System.out.println("m4");
    }
}
