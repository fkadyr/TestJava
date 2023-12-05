package test;

import java.util.Arrays;
import java.util.Random;

public class Sort {
    public static void bubbleSort(int[] mas) {
        int n = mas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    int t = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = t;
                }
            }
        }
    }

    public static void test(int[] mas) {
        int[] mas2 = Arrays.copyOf(mas, mas.length);
        Arrays.sort(mas2);
        bubbleSort(mas);
        if (Arrays.equals(mas, mas2)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public static void test1() {
        try {
            Random random = new Random();
            for (int i = 0; i < 10000; i++) {
                int[] mas = new int[100];
                for (int j = 0; j < 50; j++) {
                    mas[j] = random.nextInt(1000);
                }
                test(mas);
            }
        } catch (Exception e) {
            System.out.println("Test Failed");
        }
    }

    public static void test2() {
        int[] mas = {};
        try {
            test(mas);
        } catch (Exception e) {
            System.out.println("Test Failed");
        }
    }

    public static void test3() {
        try {
            int[] maxMas = new int[1000];
            int max = Integer.MAX_VALUE;
            for (int i = 0; i < maxMas.length; i++) {
                maxMas[i] = max;
            }
            test(maxMas);
        } catch (Exception e) {
            System.out.println("Test failed");
        }
    }

    public static void test4(){
        int[] mas = {9, 5, 7, 4, 8, 3, 10, 11, 1, -2 };
        test(mas);
    }


    public static void main(String[] args) {
        System.out.println("Случайный тест");
        test1();
        System.out.println("Тест с нулем");
        test2();
        System.out.println("Тест с максимальным значением");
        test3();
        System.out.println("Регрессионный тест");
        test4();
    }
}
