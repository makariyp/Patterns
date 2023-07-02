package org.makariyp.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class IteratorTest {
    @Test
    void iterator() {
        MyCollection collection = new MyCollection();
        for (int i : collection) {
            assertTrue(collection.contains(i));
        }
    }
}