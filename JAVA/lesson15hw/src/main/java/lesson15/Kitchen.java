package lesson15;

public class Kitchen extends Employee {

    int serviceCharge;

    public Kitchen(int id, String name, int age, int basicSalary, int serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public void setserviceCharge(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public int getserviceCharge() {
        return serviceCharge;
    }

    @Override
    public int  calculatorSalary(int basicSalary) {
        return getBasicSalary() + serviceCharge;
    }

    @Override
    public String toString() {
        return super.toString() +" lương: "+ calculatorSalary(basicSalary);
    }
}
