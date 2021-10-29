import java.util.Scanner;

public class E2 {
    public static void NameCheck() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String name = sc.nextLine();

        String[] output = name.split("\\s+");
        for (int i = 0; i < output.length; i++) {
            String temp = output[i];
            String first = temp.substring(0, 1);
            first = first.toUpperCase();
            String mod = first.concat(temp.substring(1));
            System.out.printf("%s ", mod);
        }

        sc.close();
    }

    public static void StringCheck() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra của bạn: ");
        String palin = sc.nextLine();

        for (int i = -1; i < palin.length();) {
            i++;
            if (palin.charAt(i) != palin.charAt(palin.length() - 1 - i)) {
                System.out.println("Chuỗi này không phải là chuỗi palindrome.");
                break;                
            } else {
                System.out.println("Chuỗi này là chuỗi palindrome.");
                break;
            }
        }
        sc.close();
    }

}
