package org.kras;

public class MyC implements IFace{
    @Override
    public void m1() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        IFace.m3();
        //IFace.m4();  This will cause a compile-time error because m4 is private
        IFace myClass = new MyC();
        //myClass.m4(); // This will cause a compile-time error because m4 is private
        //myClass.m3(); // This will work because m3 is static and can be called on the interface
        //IFace.m2(); // This will work because m2 is a default method in the interface
        new MyC().m2();
        // Private static method m4() can only be called from within IFace interface
        // It cannot be accessed from outside the interface, even by implementing classes
    }
}

