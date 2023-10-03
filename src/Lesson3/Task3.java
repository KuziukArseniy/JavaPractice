package Lesson3;

public class Task3 {
    public static void main(String[] args) {
        // Найти разницу между суммой элементов стоящих на четных и нечетных местах
        int sumOfOdd = 0;
        int sumOfHonest = 0;
        int[] arr = {3, 5, 1, 6, 1, 34, 3, 25, -1234, 5, 3, -1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                sumOfHonest += arr[i];
            if (arr[i] % 2 != 0)
                sumOfOdd += arr[i];
        }
        System.out.println("Разница между суммами: " + (sumOfHonest - sumOfOdd));
    }
}