package Lesson4;

import java.util.Arrays;

public class RunArr {
    public static void main(String[] args) {
        int[] arr = {66, 5, 1, 7, 10, 9, 69};
        Arr object = new Arr(arr);
        System.out.println("Максимальный элемент массива: " + object.find_max_el());
        System.out.println("Отсортированный массив: " + Arrays.toString(object.sort()));
    }
}
