package org.makariyp.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {

    @Test
    public void testOperation() {
        // gives
        Component component = new DefaultComponent();
        Component plus = new PlusDecorator(component);
        Component minus = new MinusDecorator(component);

        // when
        int defaultInt = component.operation();
        int plusInt = plus.operation();
        int minusInt = minus.operation();

        // then
        assertEquals(defaultInt, plusInt - 1);
        assertEquals(defaultInt, minusInt + 1);
    }
}