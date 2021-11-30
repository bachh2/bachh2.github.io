package lesson17;

import java.util.ArrayList;
import java.util.Scanner;



public class Transfer {
    public static void transfermoney() {      
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngân hàng để chuyển tiền: ");
        String bank = sc.nextLine();
        System.out.println("Nhập số tài khoản nhận tiền: ");
        int acc = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập chú thích: ");
        String comment = sc.nextLine();
        System.out.println("Nhập số tiền muốn gửi: ");
        long moneysend = sc.nextLong();
        if (moneysend > 4950000) {
            System.out.println("Số tiền trong tài khoản còn lại phải nhiều hơn 50.000vnd");
        }
        else {
            System.out.println("Chuyển khoản thành công");
            ArrayList<Transaction> hisTransaction = new ArrayList<Transaction>();
            hisTransaction.add(new Transaction("30/11/2021", comment + " - " + bank, acc, 0 - moneysend));
            System.out.println(hisTransaction.get(hisTransaction.size()-1));
        }
        sc.close();

    }
}

