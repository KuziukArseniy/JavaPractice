package Lesson5;

public class Worker extends Employee {


    public Worker(String name, String surname, int experience, int baseRate, Employee.prof prof) {
        super(name, surname, experience, baseRate, prof);
    }

    @Override
    public prof type() {
        return Employee.prof.worker;
    }

}
