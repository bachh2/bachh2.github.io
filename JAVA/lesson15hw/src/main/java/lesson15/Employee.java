package lesson15;

public abstract class Employee {
    int id;
    String name;
    int age;
    int basicSalary;

    public Employee(int id, String name, int age, int basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public abstract int calculatorSalary(int basicSalary);

    public String toString() {
        return "Mã số: " + id + ", Tên: " + name + ", Tuổi: " + age;
    };
}