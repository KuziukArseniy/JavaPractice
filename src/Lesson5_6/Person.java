package Lesson5_6;

public class Person {
    private final String name;

    public String getName() {
        return name;
    }

    private final String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getPerson() {
        return name + " " + surname;
    }

}
