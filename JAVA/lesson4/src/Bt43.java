import java.util.Scanner;

public class Bt43 {
    public static void PT() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập số b");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập số c");
        double c = sc.nextDouble();
        sc.nextLine();

        if (a == 0) {
            System.out.println("Số a không đạt yêu cầu");
        } else {
            if (b * b - 4 * a * c >= 0) {
                double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
                double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
                System.out.println("Nghiệm của phương trình là: "+ x1 +" và "+x2);
            }
            else System.out.println("Phương trình vô nghiệm.");
        
        }   
        sc.close();
    }

}
