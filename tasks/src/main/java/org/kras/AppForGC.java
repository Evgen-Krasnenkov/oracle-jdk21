package org.kras;
/*
Which statement is true while the program prints the word "playing"?
• None of the App instances are eligible for garbage collection
• All of the App instances are eligible for garbage collection
• Two instances of the App are eligible for garbage collection
• Only one instance of the App is eligible for garbage collection
 */
public class AppForGC {
    private AppForGC app;
    private AppForGC() {
        this.app = null;
    }
    public AppForGC(AppForGC app) {
        this.app = app;
    }
    public String play() {
        return "playing";
    }

    public static void main(String[] args) {
        AppForGC a1 = new AppForGC();
        AppForGC a2 = new AppForGC(a1);
        AppForGC a3 = new AppForGC();
        a1 = null;
        System.out.println(a2.play());
    }
}
