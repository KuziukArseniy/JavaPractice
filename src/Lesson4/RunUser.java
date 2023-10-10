package Lesson4;

public class RunUser {
    public static void main(String[] args) {
        User user = new User("Arseniy", "Kuziuk", 18, User.Gender.Male);
        System.out.println("Name: " + user.getName() + " Surname: " + user.getSurname());
        System.out.println(user.increaseAge(3));
        user.information();
        User emptyConstructor = new User();
        emptyConstructor.information();
    }
}
