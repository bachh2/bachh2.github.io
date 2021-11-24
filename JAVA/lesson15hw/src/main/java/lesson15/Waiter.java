package lesson15;

public class Waiter extends Employee {

    int compensate;

    public Waiter(int id, String name, int age, int basicSalary, int compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public void setCompensate(int compensate) {
        this.compensate = compensate;
    }

    public int getCompensate() {
        return compensate;
    }

    @Override
    public int calculatorSalary(int basicSalary) {
        return getBasicSalary() + compensate;
    }

    @Override
    public String toString() {
        return super.toString() + " lương: " + calculatorSalary(basicSalary);
    }
}
