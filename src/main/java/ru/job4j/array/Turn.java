package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int part = array.length / 2;
        for (int i = 0; i < part; i++) {
            int memo = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = memo;
        }
        return array;
    }
}
