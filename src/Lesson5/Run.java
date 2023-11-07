package Lesson5;

public class Run {
    public static void main(String[] args) {
        Employee director1 = new Director("Arseniy", "Kuziuk", 5, 5, Employee.prof.director);
        System.out.println(director1.getPerson() + " " + director1.type() + " " + director1.salary());
        Employee worker1 = new Worker("Fedor", "Michajlov", 2, 3, Employee.prof.worker);
        Employee worker2 = new Worker("Master", "Masterov", 5, 5, Employee.prof.worker);
        Employee worker3 = new Worker("Beginner", "Beginnerov", 1, 1, Employee.prof.worker);
        director1.addWorker(worker1);
        System.out.println(worker1.getPerson() + " " + worker1.salary());
        director1.addWorker(worker2);
        System.out.println(worker2.getPerson() + " " + worker2.salary());
        director1.addWorker(worker3);
        System.out.println(worker3.getPerson() + " " + worker3.salary());
        Employee director2 = new Director("Maria", "Dyatko", 4, 4, Employee.prof.director);
        Employee worker4 = new Worker("Arsesha", "Kuziuk", 3, 3, Employee.prof.worker);
        director2.addWorker(worker4);
        director1.addWorker(director2);
        director2.toStringDirector();
    }
}
