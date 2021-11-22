package homework;

import java.util.Scanner;

 class Triangle {
     public static void CheckTriangle() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhập số đo cạnh 1");
         String c1 = sc.nextLine();
         System.out.println("Nhập số đo cạnh 2");
         String c2 = sc.nextLine();
         System.out.println("Nhập số đo cạnh 3");
         String c3 = sc.nextLine();
         sc.close();
         try {
             int checkc1 = Integer.parseInt(c1);
             int checkc2 = Integer.parseInt(c2);
             int checkc3 = Integer.parseInt(c3);
             if (checkc1 < 0 || checkc2 < 0 || checkc3 < 0) {
                 throw new ArithmeticException("Số đo cạnh không được nhỏ hơn 1");
             }
             else if (checkc1 + checkc2 > checkc3 && checkc1 + checkc3 > checkc2 && checkc2 + checkc3 > checkc1) {
                 System.out.println("Đây là 1 tam giác");
             } else {
                 System.out.println("Đây không phải tam giác");
             }
         } catch (NumberFormatException e) {
             System.out.println("Số đo nhập vào không hợp lệ");
         }    
    }   
}
