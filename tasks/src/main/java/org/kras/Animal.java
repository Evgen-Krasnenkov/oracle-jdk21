package org.kras;

public abstract class Animal {
    public static enum Type {
        CAT, DOG, FISH
    }
    private Type type;
    public Animal(Type type) {
        this.type = type;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public abstract String name();
    public String toString(){
        return name() + " " + type;
    }
    public static void main(String[] args) {
        Animal a = new Pet("Fido", Type.DOG);
        Animal b = new SuperPet("Fido", Type.DOG);
        System.out.println(a);
        System.out.println(b);
    }
}
