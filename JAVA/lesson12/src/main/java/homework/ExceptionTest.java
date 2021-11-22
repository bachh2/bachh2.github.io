package homework;

import java.util.Scanner;

public final class ExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        System.out.println("1: Kiểm tra tam giác");
        System.out.println("2: Kiểm tra tuổi");
        System.out.println("Nhập phần việc cần thực hiện");
        String s = sc.nextLine();
       
        try {
            int job = Integer.parseInt(s);
            if (job == 1 || job == 2) {
                switch (job) {
                case 1:
                    Triangle.CheckTriangle();
                    break;
                case 2:
                    PInfo.PersonalInfoCheck();
                    break;
                }
            } else {
                throw new ArithmeticException("Không có phần viejc này.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Năm sinh phải là số");
        }
            sc.close();
    }
}
