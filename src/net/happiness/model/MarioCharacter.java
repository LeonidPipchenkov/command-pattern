package net.happiness.model;

public class MarioCharacter {

    private final String name;

    public MarioCharacter() {
        name = "Mario";
    }

    public void moveUp() {
        System.out.println(name + " moving up");
    }

    public void moveDown() {
        System.out.println(name + " moving down");
    }

    public void moveLeft() {
        System.out.println(name + " moving left");
    }

    public void moveRight() {
        System.out.println(name + " moving right");
    }

}
