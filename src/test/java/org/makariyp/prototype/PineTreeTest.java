package org.makariyp.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {
    @Test
    public void givenAPlasticTreePrototypeWhenClonedThenCreateA_Clone() {
        // gives
        int mass = 45;
        int height = 3;
        int position = 56;
        int otherPosition = 34;

        // when
        PlasticTree plasticTree = new PlasticTree(mass, height);
        plasticTree.setPosition(position);
        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.copy();
        anotherPlasticTree.setPosition(otherPosition);

        // then
        assertEquals(position, plasticTree.getPosition());
        assertEquals(otherPosition, anotherPlasticTree.getPosition());
    }
}