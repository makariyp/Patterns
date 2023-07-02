package org.makariyp.singlteton;

import java.util.Random;

public class BadSingleton {
    private static BadSingleton singleton;
    private final Random random = new Random();
    private final Integer randomInt = random.nextInt();

    private BadSingleton() {
    }

    public static BadSingleton getInstance() {
        if (singleton == null) {
            synchronized (BadSingleton.class) {
                singleton = new BadSingleton();
            }
        }
        return singleton;
    }

    public int getRandomInt() {
        return randomInt;
    }
}
