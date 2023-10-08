package Lesson4;

public class User {
    String name;
    String surname;
    int age;
    Gender gender;

    enum Gender {
        Male,
        Female
    }

    User(String name, String surname, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
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
