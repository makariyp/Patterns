package org.makariyp.singlteton;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class GoodSingletonTest {

    @Test
    public void mustGiveSingleForAllThreads_whenInvokeGetInstance() throws InterruptedException {
        // gives
        ExecutorService executor = Executors.newFixedThreadPool(5);
        List<GoodSingleton> singletons = new ArrayList<>();

        // when
        for (int i = 0; i < 5; i++) {
            executor.execute(() -> {
                GoodSingleton singleton = GoodSingleton.getInstance();
                singletons.add(singleton);
            });
        }
        executor.shutdown();
        boolean ok = executor.awaitTermination(1, TimeUnit.MINUTES);

        // then
        if (!ok) fail();
        for (int i = 1; i < 5; i++) {
            assertEquals(singletons.get(0), singletons.get(i), "Синглтон в 2 разных потоках не равен");
        }
    }
}