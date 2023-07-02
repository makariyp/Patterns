package org.makariyp.singlteton;

import java.util.Random;

public class GoodSingleton {
    private static final Random random;
    static {
        random = new Random();
    }
    private static volatile GoodSingleton instance;
    private final int randomInt = GoodSingleton.random.nextInt();
    private GoodSingleton() {}

    public static GoodSingleton getInstance() {
        if (instance == null) {
            synchronized (GoodSingleton.class) {
                if (instance == null) {
                    instance = new GoodSingleton();
                }
            }
        }
        return instance;
    }

    public int getRandomInt() {
        return randomInt;
    }
}
