package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort34125() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort1010194() {
        int[] data = new int[] {10, 1, 0, 19, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 4, 10, 19};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort11110() {
        int[] data = new int[] {111, 1, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 111};
        Assert.assertArrayEquals(expected, result);
    }
}