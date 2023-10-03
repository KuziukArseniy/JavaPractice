package Lesson3;

public class Task2 {
    public static void main(String[] args) {
        // В произвольном массиве найти сумму минимального и максимального элемента
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] arr = {4, 3, 6, 1, -5, 6, -1, 9, 0, 2134};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Минимальный элемент: " + min + " Максимальный элемент: " + max);
    }
}