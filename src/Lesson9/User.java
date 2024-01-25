package Lesson9;

import java.util.Objects;

public class User implements Comparable {
    private final String name;
    private final GENDER gender;
    private final int age;

    public String getName() {
        return name;
    }

    public GENDER getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public User(String name, int age, User.GENDER gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    enum GENDER {
        M,
        W
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(gender, user.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age);
    }

    @Override
    public int compareTo(Object o) {
        User user = (User) o;
        if (age > user.age) return 1;
        else if (age < user.age) return -1;
        else return name.compareTo(user.name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
