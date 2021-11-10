public class Kitchen extends Employee {

    double serviceCharge;

    public Kitchen(int id, String name, int age, double basicSalary, double serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public void setserviceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public double getserviceCharge() {
        return serviceCharge;
    }

    @Override
    public double calculatorSalary(double basicSalary) {
        return getBasicSalary() + serviceCharge;
    }

    public void display() {
        System.out.println(
                "Mã số: " + getId + ", Tên: " + getName + ", Tuổi: " + getAge + ", Lương: " + calculatorSalary());
    }
}
