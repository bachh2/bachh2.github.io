package midterm;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginSuc {
    public static void Acclogon(String loguser) {
        System.out.println("Chào mừng " + loguser + ", bạn muốn làm gì?");
        Scanner sc = new Scanner(System.in);
       
        accountlist acclist = new accountlist();
        ArrayList<account> list = acclist.getData();
        
        // boolean isCheck = false;
        // while (!isCheck) {
        System.out.println(
                "1 - Thay đổi username\n2 - Thay đổi mật khẩu\n3 - Thay đổi email\n4 - Đăng xuất\n0 - thoát chương trình");
        int job = sc.nextInt();
        switch (job) {
            case 1:
                System.out.println("Nhập username mới: ");
                String newuser = sc.nextLine();
                account usersearch = list.stream().filter(e -> e.getUsername().equals(newuser)).findFirst()
                        .orElse(null);
                if (usersearch != null) {
                    System.out.println("Đã có username này, vui lòng chọn username khác");
                } else if (usersearch == null) {
                    account user1search = list.stream().filter(e -> e.getUsername().equals(loguser)).findFirst()
                            .orElse(null);
                    user1search.setUsername(newuser);
                }
                break;

            case 2:
                System.out.println("Nhập email mới: ");
                String newemail = sc.nextLine();
                Pattern patternmail = Pattern.compile("^(.+)@(\\S+)$", Pattern.CASE_INSENSITIVE);
                Matcher matchermail = patternmail.matcher(newemail);
                boolean match1Found = matchermail.find();
                if (!match1Found) {
                    System.out.println("Email không hợp lệ");
                    break;
                }
                account emailsearch = list.stream().filter(e -> e.getEmail().equals(newemail)).findFirst()
                        .orElse(null);
                if (emailsearch != null) {
                    System.out.println("Đã có email này, vui lòng chọn email khác");
                } else if (emailsearch == null) {
                    account user2search = list.stream().filter(e -> e.getUsername().equals(loguser)).findFirst()
                            .orElse(null);
                    user2search.setEmail(newemail);
                }
                break;

            case 3:
                System.out.println("Nhập mật khẩu mới: ");
                String newpass = sc.nextLine();
                Pattern patternpass = Pattern
                        .compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[.,-_;])(?=\\S+$).{7,15}$");
                Matcher matcherpass = patternpass.matcher(newpass);
                boolean match2Found = matcherpass.find();
                if (!match2Found) {
                    System.out.println("Mật khẩu không hợp lệ");
                    break;
                }
                account user3search = list.stream().filter(e -> e.getUsername().equals(loguser)).findFirst()
                        .orElse(null);
                user3search.setPassword(newpass);

                break;

            case 4:
                Login.logon();
                break;
            case 0:
                System.out.println("Tạm biệt.");
                // isCheck = true;
                break;
            default:
                System.out.println("Không có lựa chọn này. ");
                // }
        }
        sc.close();
    }
}
