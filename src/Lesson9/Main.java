package Lesson9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new LinkedList<>();
        Set<User> userSet = new TreeSet<>();
        User user1 = new User("Arseniy", 18, User.GENDER.M);
        userList.add(user1);
        userSet.add(user1);
        User user2 = new User("Each",  17, User.GENDER.W);
        userList.add(user2);
        userSet.add(user2);
        User user3 = new User("Moriarti",  18, User.GENDER.W);
        userList.add(user3);
        userSet.add(user3);
        User user4 = new User("Each", 20, User.GENDER.M);
        userList.add(user4);
        userSet.add(user4);

        for (Object o : userSet) {
            System.out.print(o + " ");
        }
        System.out.println();
        Service.search(userList, "Each");
        Set<User> genderUsers = Service.getGenderCollection(userSet, User.GENDER.M);
        for (Object o : genderUsers) {
            System.out.print(o.toString());
        }
        System.out.println();
    }
}
