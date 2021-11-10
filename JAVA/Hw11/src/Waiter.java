public class Waiter extends Employee {

    double compensate;

    public Waiter(int id, String name, int age, double basicSalary, double compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public void setCompensate(double compensate) {
        this.compensate = compensate;
    }

    public double getCompensate() {
        return compensate;
    }

    @Override
    public double calculatorSalary(double basicSalary) {
        return getBasicSalary() + compensate;
    }

    public void display() {
        System.out.println(
                "Mã số: " + getId + ", Tên: " + getName + ", Tuổi: " + getAge + ", Lương: " + calculatorSalary());
    }
}
