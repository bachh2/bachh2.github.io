import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E6 {
    public static void Email() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập email của bạn: ");
        String email = sc.nextLine();
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }
        sc.close();
    }
}
