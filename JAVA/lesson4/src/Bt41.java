import java.util.Scanner;

public class Bt41 {
    public static void Triangle() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số đo cạnh 1: ");
        double c1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập số đo cạnh 2: ");
        double c2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập số đo cạnh 3: ");
        double c3 = sc.nextDouble();

        if (c3 > 0 && c2 > 0 && c1 > 0) {
            if (c3 < c1 + c2 && c2 < c3 + c1 && c1 < c2 + c3) {
                if (c1 == c2 && c1 == c3) {
                    System.out.println("Đây là tam giác đều.");
                } else if (c1 * c1 + c2 * c2 == c3 * c3 || c1 * c1 + c3 * c3 == c2 * c2
                        || c3 * c3 + c2 * c2 == c1 * c1) {
                    if (c1 == c2 || c1 == c3) {
                        System.out.println("Đây là tam giác vuông cân.");
                    } else
                        System.out.println("Đây là tam giác vuông");
                } else if (c1 == c2 || c1 == c3) {
                    System.out.println("Đây là tam giác cân");
                } else
                    System.out.println("Đây là tam giác thường");
            } else
                System.out.println("Không phải tam giác.");
        } else
            System.out.println("Số đo các cạnh không hợp lệ.");
            sc.close();
    }


}
