package org.example;

public class Main {
    public static void main(String[] args) {
        //тесткейс
        int[] arrayInt = {1, 2, 3, 4, 5, 6, 7, -8, 7};

        //вызов методов в консоль
        System.out.println(new Main().findMid(arrayInt));
        System.out.println(new Main().findSum(arrayInt));
        System.out.println(new Main().findBiggestSum(arrayInt));
    }

    //задание 1
    public int findMid(int[] array) {
        int sumPositive = 0;
        int count = 0;
        for (int val : array) {
            if (val > 0) {
                sumPositive += val;
                count++;
            }
        }
        return sumPositive / count;
    }

    // задание 2
    public int findSum(int[] array) {
        int sum = 0;
        for (int val : array) {
            if (val % 3 == 0 && val % 5 != 0) {
                sum += val;
            }
        }
        return sum;
    }

    //задание 3
    public int findBiggestSum(int[] array) {
        int sum = 0;
        int bestSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum > bestSum) {
                    bestSum = sum;
                }
            }
            sum = 0;
        }
        return bestSum;
    }
}