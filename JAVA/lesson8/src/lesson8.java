import java.util.Scanner;

public class lesson8 {
    public static void main(String[] args) throws Exception {            
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số học sinh cần nhập: ");
        int num = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[num];
        for (int i = 0; i < num; i++) {                   
            System.out.println("Nhập ID của học sinh: ");
            String id = sc.nextLine();
            System.out.println("Nhập tên của học sinh: ");
            String name = sc.nextLine();
            System.out.println("Nhập điểm lý thuyết của học sinh: ");
            double theory = sc.nextDouble();
            sc.nextLine();
            System.out.println("Nhập điểm thực hành của học sinh: ");
            double practical = sc.nextDouble();
            sc.nextLine();
            Student temp = new Student(id, name, theory, practical);
            students[i] = temp;
        }

        for (Student s : students) {
            System.out.println("Thông tin của học sinh: " + s);           
            System.out.println("Điểm trung bình: "+ s.getAverage());

        }
    sc.close();
    }
}
