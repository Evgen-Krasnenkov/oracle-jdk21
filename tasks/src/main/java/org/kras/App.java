package org.kras;

/*
What is the result?
- mA
- mB
  mA
- mB
  mC
- mB
 */
public class App {
    public static void main(String[] args) {
        A bobj = new B();
        A cobj = new C();
        if (cobj instanceof B v) {
            v.mB();
            if (v instanceof C v1) {
                v1.mC();
            }
        } else {
            cobj.mA();
        }
    }
}
