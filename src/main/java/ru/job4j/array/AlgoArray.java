package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        changeElems(array, 0, 3);
        changeElems(array, 1, 2);
        changeElems(array, 3, 4);
        for (int elem : array) {
            System.out.println(elem);
        }
    }

    public static void changeElems(int[] array, int sourse, int destination) {
        int temp = array[sourse];
        array[sourse] = array[destination];
        array[destination] = temp;
    }
}
