package Lesson4;

import java.lang.reflect.Method;

public class OverloadClass {
    static int method(int number) {
        return number + 5;
    }

    static String method(String string) {
        return string + " + я вернул строку";
    }
}
