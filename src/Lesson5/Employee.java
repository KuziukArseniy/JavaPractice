package Lesson5;

public abstract class Employee extends Person {
    private final int experience;
    private final int baseRate;
    private final prof prof;

    public Employee(String name, String surname, int experience, int baseRate, Employee.prof prof) {
        super(name, surname);
        this.experience = experience;
        this.baseRate = baseRate;
        this.prof = prof;
    }


    public enum prof {
        worker(1), director(2);
        private final int coefficient;

        prof(int coefficient) {
            this.coefficient = coefficient;
        }
    }

    public int salary() {
        return baseRate * prof.coefficient * experience;
    }

    abstract public prof type();

    public void addWorker(Employee employee) {
        return;
    }
    public void toStringDirector(){
        return;
    }
}
