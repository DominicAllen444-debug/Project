package com.example;

import java.util.Objects;
public class App {
    public long sum(int[] values) {
        Objects.requireNonNull(values, "values must not be null");
        long total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Array sum = " + app.sum(new int[] {1, 2, 3, 4, 5}));
    }
}
