public class Student {
    String id;
    String name;
    double theory;
    double practical;    

    public Student(String id, String name, double theory, double practical) {
        this.id = id;
        this.name = name;
        this.theory = theory;
        this.practical = practical;       
    }

    public String toString() {
        return id + " " + name + " " + getTheory() + " " + getPractical();
    }
    
    public double getTheory() {
        return theory;
    }   
    
    public double getPractical() {
        return practical;
    }

    public double getAverage()
    {
        return (theory + practical) / 2;
    }
}