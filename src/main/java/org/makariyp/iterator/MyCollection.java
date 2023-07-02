package org.makariyp.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class MyCollection implements Iterable<Integer> {
    private final int[] array = new int[] {0, 1, 2, 3};
    private int cursor = 0;
    @Override
    public Iterator<Integer> iterator() {
        cursor = 0;
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return cursor < array.length;
            }

            @Override
            public Integer next() {
                return array[cursor++];
            }
        };
    }

    public boolean contains(int i) {
        return Arrays.binarySearch(array, i) >= 0;
    }
}
