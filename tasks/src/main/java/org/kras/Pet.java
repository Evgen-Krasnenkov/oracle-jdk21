package org.kras;

public class Pet extends Animal implements Playable {
    private String name;

    public Pet(String name, Type type) {
        super(type);
//        super.setType(type); // We need super(type) to set the type to compile
        this.name = name;
    }

    public String play() {
        return "Fetch";
    }

    @Override
    public String name() {
        return  this.play() + " " + this.name;
    }
}
