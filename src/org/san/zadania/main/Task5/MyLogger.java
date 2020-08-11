package org.san.zadania.main.Task5;

public interface MyLogger {
    <T> void serializeAndLog(T o);

    default void log(String s) {
        System.out.println(s);
    }

    default void log(int n) {
        System.out.println(n);
    }
}
