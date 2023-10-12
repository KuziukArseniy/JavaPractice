package Lesson4;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        int[] arr = {66, 5, 1, 7, 10, 9, 69};
        Arr object = new Arr(arr);
        System.out.println("Максимальный элемент массива: " + object.find_max_el());
        System.out.println("Отсортированный массив: " + Arrays.toString(object.sort()));
        Address address = new Address(Address.Country.Russia, Address.City.Moscow);
        User user = new User("Arseniy", "Kuziuk", 18, User.Gender.Male, address);
        System.out.println("Name: " + user.getName() + " Surname: " + user.getSurname());
        System.out.println(user.increaseAge(3));
        user.information();
        User emptyConstructor = new User();
        emptyConstructor.information();
        OverloadClass overload = new OverloadClass();
        System.out.println(OverloadClass.method(2));
        System.out.println(OverloadClass.method("Арсеша"));
    }
}
