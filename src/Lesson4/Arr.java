package Lesson4;

public class Arr {
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if (j < arr.length - 1)
                    if (arr[i] < arr[j]) {
                        int t = arr[j];
                        arr[j] = arr[i];
                        arr[i] = t;
                    }
            }
        }
        return arr;
    }
}