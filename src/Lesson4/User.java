package Lesson4;

public class User {
    String name;
    String surname;
    int age;
    Gender gender;

    enum Gender {
        Male,
        Female,
        None
    }

    User(String name, String surname, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = 0;
        this.gender = Gender.None;
    }

    User() {
        this.name = "None";
        this.surname = "None";
        this.age = 0;
        this.gender = Gender.None;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int increaseAge(int increase) {
        return age + increase;
    }

    public void information() {
        String str = String.format("Name: %s, Surname: %s, Age: %s, Gender: %s", name, surname, age, gender);
        System.out.println(str);
    }
}
