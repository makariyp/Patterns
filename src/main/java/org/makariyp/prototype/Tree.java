package org.makariyp.prototype;

public abstract class Tree {
    private final int mass;
    private final int height;
    private int position;

    public Tree(int mass, int height) {
        this.mass = mass;
        this.height = height;
    }

    public abstract Tree copy();

    public int getMass() {
        return mass;
    }

    public int getHeight() {
        return height;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}