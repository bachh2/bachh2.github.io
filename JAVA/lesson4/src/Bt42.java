import java.util.Scanner;

public class Bt42 {
    public static void DTB() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm toán: ");
        double sub1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập điểm văn: ");
        double sub2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập điểm lý: ");
        double sub3 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập điểm hóa: ");
        double sub4 = sc.nextDouble();
        sc.nextLine();

        double TBC = (sub1 + sub2 + sub3 + sub4) / 4;

        if (sub1 > 0 && sub2 > 0 && sub3 > 0 && sub4 > 0 && sub1 <= 10 && sub2 <= 10 && sub3 <= 10 && sub4 <= 10) {
            System.out.println("Điểm trung bình là: "+TBC);
            if (TBC < 4.5) {
                System.out.println("Học lực kém");
            } else if (TBC > 4.5 && TBC < 6.5) {
                System.out.println("Học lực trung bình");
            } else if (TBC > 6.5 && TBC < 8) {
                System.out.println("Học lực khá");
            } else if (TBC > 8) {
                System.out.println("Học lực giỏi");
            }
        }
        else
            System.out.println("Điểm số nhập sai.");
        sc.close();
    }
}