package midterm;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public static void logon() {
        Scanner sc = new Scanner(System.in);
        // boolean checkaccount = false;
        // while (!checkaccount) {
            System.out.println("Nhập username: ");
            String loguser = sc.nextLine();
            System.out.println("Nhập mật khẩu: ");
            String logpass = sc.nextLine();

            ArrayList<account> list;
            accountlist data = new accountlist();
            list = data.getAccount();

            account usersearch = list.stream().filter(e -> e.getUsername().equals(loguser)).findFirst()
                    .orElse(null);
            if (usersearch.equals(null)) {
                System.out.println("Kiểm tra lại username.");
                Login.logon();
            }

            else if (!usersearch.equals(null)) {
                if (logpass.equals(usersearch.getPassword())) {
                    // checkaccount = true;   
                    LoginSuc.Acclogon();           
                } else if (!logpass.equals(usersearch.getPassword())) {
                    System.out.println("Kiểm tra lại mật khẩu.");
                    System.out.println("Vui lòng chọn\n 1 - Đăng nhập lại\n 2 - Quên mật khẩu ");
                    int wrongpass = sc.nextInt();
                    sc.nextLine();
                    switch (wrongpass) {
                        case 1:
                            Login.logon();
                            break;
                        case 2:
                            Login.reset();
                            break;
                    }
                }
            }
        // }
        
        
        sc.close();

    }

    public static void reset() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập email của bạn: ");
        String resetmail = sc.nextLine();

        ArrayList<account> list;
        accountlist data = new accountlist();
        list = data.getAccount();

        account mailsearch = list.stream().filter(e -> e.getEmail().equals(resetmail)).findFirst()
                .orElse(null);
        if (mailsearch.equals(null)) {
            System.out.println("Tài khoản chưa tồn tại");
            Signup.signUp();
        }
        else if (!mailsearch.equals(null)) {
            System.out.println("Mật khẩu mới là:");
            String newpass = sc.nextLine();
            mailsearch.setPassword(newpass);
            Login.logon();
        }
        sc.close();
    }
}