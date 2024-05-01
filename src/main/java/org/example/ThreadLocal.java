package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocal {

    private static final AtomicInteger nextId = new AtomicInteger(0);

    private static final java.lang.ThreadLocal<Integer> threadId =
            new java.lang.ThreadLocal<>().withInitial(() -> nextId.incrementAndGet());
    public static void main(String[] args) {

    }
}
