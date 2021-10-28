package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
        max(1, 4);
    }

    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
}
