package org.kras;

public class Symbols {
    private char value = '?';

    public Symbols(char value) {
        this.value = value;
    }

    public Symbols() {
        this('!');
    }

    static {
        System.out.print('/');
    }

    {
        System.out.print(this.value);
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static void main(String[] args) {
        Symbols s1 = new Symbols();
        Symbols s2 = new Symbols('-');
        String symbols = s1.toString() + s2.toString();
        System.out.print(symbols);
    }
}