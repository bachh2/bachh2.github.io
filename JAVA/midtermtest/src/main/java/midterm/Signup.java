package midterm;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Signup {
    public static void signUp() {
        Scanner sc = new Scanner(System.in);
        boolean AccCheck = false;
        while (!AccCheck) {
            System.out.println("Nhập email của bạn: ");
            String newmail = sc.nextLine();
            System.out.println("Nhập username của bạn: ");
            String newuser = sc.nextLine();
            System.out.println("Nhập mật khẩu của bạn: ");
            String newpass = sc.nextLine();

            Pattern patternmail = Pattern.compile("^(.+)@(\\S+)$", Pattern.CASE_INSENSITIVE);
            Matcher matchermail = patternmail.matcher(newmail);
            boolean match1Found = matchermail.find();
            if (!match1Found) {
                System.out.println("Email không hợp lệ");
            }

            Pattern patternpass = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[.,-_;])(?=\\S+$).{7,15}$");
            Matcher matcherpass = patternpass.matcher(newmail);
            boolean match2Found = matcherpass.find();
            if (!match2Found) {
                System.out.println("Mật khẩu không hợp lệ");
            }
            ArrayList<account> list;
            accountlist data = new accountlist();
            list = data.getAccount();
            boolean checkemail = false;
            account mailsearch = list.stream().filter(e -> e.getEmail().equals(newmail)).findFirst()
                    .orElse(null);
            if (mailsearch.equals(null)) {
                checkemail = true;
            }

            boolean checkuser = false;
            account usersearch = list.stream().filter(e -> e.getUsername().equals(newmail)).findFirst()
                    .orElse(null);
            if (usersearch.equals(null)) {
                checkuser = true;
            }

            if (match1Found && match2Found && checkemail && checkuser) {
                System.out.println("Tài khoản của bạn đã được đăng ký");
                list.add(new account(newuser, newpass, newmail));
                AccCheck = true;
            }

            else {System.out.println("Tài khoản của bạn không hợp lệ");}
        }
        sc.close();
    }
}
