package lesson17;

import java.util.Scanner;
import java.util.ArrayList;

public final class App {
   
    public static void main(String[] args) {
        String mobile = "0123456789";
        String password = "123456789";        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại: ");
        String moblog = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String passlog = sc.nextLine();
        if (moblog.equals(mobile)&&passlog.equals(password))
        {   
            ArrayList<Transaction> hisTransaction = new ArrayList<Transaction>();
            hisTransaction.add(new Transaction("28/10/2021", "Lương tháng 10", 2164984, 16000000));
            hisTransaction.add(new Transaction("29/11/2021", "Lương tháng 11", 2164984, 16000000 ));
            System.out.println("Bạn muốn chuyển tiền hay tra cứu thông tin?");
            System.out.println("1 - Chuyển tiền.");
            System.out.println("2 - Tra cứu.");
            int work = sc.nextInt();
            sc.nextLine();
            switch (work) {
                case 1:
                    Transfer.transfermoney();
                    break;

                case 2:
                    hisTransaction.forEach(a -> System.out.println(a));
            }

        }
        else {
            System.out.println("Sai tài khoản hoặc mật khẩu.");
        }
        sc.close();
    }
}
