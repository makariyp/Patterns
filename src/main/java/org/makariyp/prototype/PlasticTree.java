package org.makariyp.prototype;

public class PlasticTree extends Tree {
    public PlasticTree(int mass, int height) {
        super(mass, height);
    }

    @Override
    public Tree copy() {
        PlasticTree plasticTreeClone = new PlasticTree(this.getMass(), this.getHeight());
        plasticTreeClone.setPosition(this.getPosition());
        return plasticTreeClone;
    }

}