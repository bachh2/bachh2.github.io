package homework;

import java.util.Scanner;
 
class PInfo {
     public static void PersonalInfoCheck() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhập tên: ");
         String name = sc.nextLine();
         System.out.println("Nhập địa chỉ: ");
         String addr = sc.nextLine();
         System.out.println("Nhập năm sinh");
         String bd = sc.nextLine();
         sc.close();
        try {
            int byear = Integer.parseInt(bd);
            if (byear < 1900 || byear > 2021) {
                throw new ArithmeticException("Năm sinh không hợp lệ.");}
            else {
                int age = 2021 - byear;
                System.out.println("Tên: "+name);
                System.out.println("Địa chỉ: "+addr);
                System.out.println(+age+" tuổi.");
                if (age >=18){
                    System.out.println("Bạn đã đủ tuổi bầu cử");
                }
                else {System.out.println("Bạn chưa đủ tuổi.");}
            }            
           }
           catch (NumberFormatException e) {
             System.out.println("Năm sinh phải là số");
         }    
     }
}
