package Lesson5_6;

import java.util.Arrays;

public class Director extends Employee {

    private Employee[] workers = new Employee[0];

    public Director(String name, String surname, int experience, int baseRate, Employee.prof prof) {
        super(name, surname, experience, baseRate, prof);
    }

    @Override
    public void addWorker(Employee employee) {
        workers = Arrays.copyOf(workers, workers.length + 1);
        workers[workers.length - 1] = employee;
    }


    @Override
    public int salary() {
        return super.salary() + (workers.length * 2);
    }

    @Override
    public Employee.prof type() {
        return prof.director;
    }

    @Override
    public void toStringDirector() {
        System.out.println(super.getPerson() + " " + salary());
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i].getPerson() + " " + workers[i].salary() + " " + workers[i].type());
        }
    }

    @Override
    public void findWorker(String name) {
        boolean true_or_false = false;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().equals(name)) {
                System.out.println("Такой сотрудник есть в подчинении у этого директора");
                true_or_false = true;
            }
        }
        if (!true_or_false) {
            System.out.println("Такого сотрудника нет в подчинении у этого директора");
        }
    }
}
