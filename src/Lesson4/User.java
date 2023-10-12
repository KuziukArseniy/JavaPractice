package Lesson4;

public class User {
    String name;
    String surname;
    int age;
    Gender gender;
    Address address;
    Address emptyClass = new Address();

    enum Gender {
        Male,
        Female,
        None
    }

    User(String name, String surname, int age, Gender gender, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.address = address;
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
        this.address = emptyClass;
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

    @Deprecated
    public void information() {
        String str = String.format("Name: %s, Surname: %s, Age: %s, Gender: %s, City: %s, Country: %s", name, surname, age, gender, address.city, address.country);
        System.out.println(str);
    }
}

class Address {
    final Country country;
    final City city;

    Address() {
        this.city = City.None;
        this.country = Country.None;
    }

    Address(Country country, City city) {
        this.country = country;
        this.city = city;
    }

    enum Country {
        Belarus,
        Russia,
        Poland,
        None
    }

    enum City {
        Minsk,
        Moscow,
        Warszawa,
        None
    }
}


