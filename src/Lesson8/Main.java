package Lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[5];
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String word = scanner.next();
            if (word.equals("get")) {
                try {
                    if (count == 0) {
                        throw new Exception();
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println(words[i]);
                        }
                    }
                } catch (Exception exception) {
                    System.out.println("NONE_DATA_IN_ARRAY");
                }
            } else {
                try {
                    if (count != 5) {
                        words[count] = word;
                    } else {
                        throw new Exception();
                    }
                } catch (Exception exception) {
                    System.out.println("COUNT_WORDS_EXCEPTION");
                }
                count++;
            }

        }
    }
}

