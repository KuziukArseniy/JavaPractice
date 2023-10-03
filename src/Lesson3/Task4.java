package Lesson3;

public class Task4 {
    public static void main(String[] args) {
        // В произвольном числовом массиве найти число, которое встречается чаще всего
        int[] arr = {3, 5, 1, 6, 1, 34, 3, 25, -1234, 5, 3, -1};
        int number = 0;
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            int count2 = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count2++;
                }
            }
            if (count1 < count2) {
                number = arr[i];
                count1 = count2;
            }
        }
        System.out.println("Число, которое встречается чаще всего: " + number);
    }
}