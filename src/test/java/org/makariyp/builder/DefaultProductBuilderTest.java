package org.makariyp.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultProductBuilderTest {
    @Test
    void mustReturnNewProduct_whenGivenAllArg() {
        // gives

        // when
        Product product = new DefaultProductBuilder()
                .first(5)
                .second("hello")
                .build();

        // then
        assertEquals(product.getFirst(), 5);
        assertEquals(product.getSecond(), "hello");
    }

    @Test
    void mustThrowIllegalArgumentException_whenOneArg() {
        // gives

        try {
            // when
            new DefaultProductBuilder()
                    .first(5)
                    .build();
            fail();

            // then
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
}