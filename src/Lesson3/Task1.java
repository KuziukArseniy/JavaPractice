package Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void fib(int count)
    {
        if (count > 0) {
            int[] firstArray = new int[count];
            firstArray[0] = 0;
            if (count > 1) {
                firstArray[1] = 1;
            }
            for (int i = 0; i < count - 2; i++) {
                firstArray[i + 2] = firstArray[i + 1] + firstArray[i];
            }
            System.out.println("Ответ: " + Arrays.toString(firstArray));
        }else
        {
            System.out.println("В массиве не может быть 0 элементов");
        }
    }
    public static void main(String[] args) {
        //Создать массив n-элементов и заполнить его числами Фиббоначи
        System.out.println("Введите кол-во элементов массива:");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        fib(count);
    }
}