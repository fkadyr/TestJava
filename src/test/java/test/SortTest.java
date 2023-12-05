package test;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void testEmptyArray() {
        int[] mas = {};
        int[] mas2 = Arrays.copyOf(mas, mas.length);
        Sort.bubbleSort(mas);
        Arrays.sort(mas2);

        assertArrayEquals(mas2, mas);
    }

    @Test
    public void testRandomValueInArray() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int[] mas = new int[100];
            for (int j = 0; j < mas.length; j++) {
                mas[j] = random.nextInt(10000);
            }
            int[] mas2 = Arrays.copyOf(mas, mas.length);
            Sort.bubbleSort(mas);
            Arrays.sort(mas2);
            assertArrayEquals(mas2, mas);
        }
    }

    @Test
    public void testMaxValueInArray() {
        int[] mas = new int[1000];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.MAX_VALUE;
        }
        int[] mas2 = Arrays.copyOf(mas, mas.length);
        Sort.bubbleSort(mas);
        Arrays.sort(mas2);
        assertArrayEquals(mas2, mas);
    }


    @Test
    public void testRegression() {
        int[] mas = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] mas2 = Arrays.copyOf(mas, mas.length);
        Sort.bubbleSort(mas);
        Arrays.sort(mas2);
        assertArrayEquals(mas2, mas);
    }
}