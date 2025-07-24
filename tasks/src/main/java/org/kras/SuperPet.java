package org.kras;

public class SuperPet extends Animal implements Playable{
    private String name;
    public SuperPet(String name, Type type) {
        super(type);
        this.name = name;
    }

    public String name(){
        return play() + " " + this.name;
    }

    public String play(){
        return "";
    }

    public String toString() {
        return "Fetch" + super.toString()
                //+ super.type does not compile here because it is private in Animal
                ;
    }
}
