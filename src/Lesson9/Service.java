package Lesson9;

import javax.swing.*;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Service {
    public static void search(List<User> u, String name) {
        Iterator<User> iterator = u.listIterator();
        for (int i = 0; i < u.size(); i++) {
            if (u.get(i).getName().equals(name)) {
                System.out.print(u.get(i).toString() + " ");
            }
        }
        System.out.println();
    }

    public static Set<User> getGenderCollection(Set<User> users, User.GENDER gender) {
        users.removeIf(genderUsers -> !genderUsers.getGender().equals(gender));
        return users;
    }
}
