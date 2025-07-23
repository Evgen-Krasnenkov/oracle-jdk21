package org.kras;

/*
What is the result?
• Compilation error
- jump fetch jump
• fetch fetch scratch
- jump fetch scratch
fetch

 */

public class TestAnimal {

    static interface Animal {
        default String play() {
            return "jump";
        }
    }

    static class Dog implements Animal {
        public String play() {
            return "fetch";
        }
    }

    static class Cat implements Animal {
        public String play() {
            return "scratch";
        }
    }

    private static void play(Animal a) {
        System.out.println(a.play());
    }

    private static void play(Dog d) {
        System.out.println(d.play());
    }

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Dog a2 = new Dog();
        Animal a3 = new Cat () ;
        play (a1) ;
        play (a2) ;
        play (a3) ;
    }
}