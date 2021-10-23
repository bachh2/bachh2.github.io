import java.util.Scanner;

public class Bt52 {
    public static void FindString() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi đầu tiên: ");
        String str1 = sc.nextLine();
        System.out.println("Nhập chuỗi thứ hai: ");
        String str2 = sc.nextLine();
        sc.close();
        int len1 = str1.length();
        int len2 = str2.length();
        int count = -1;
        for (int lena = 0; lena < len1 - len2; lena++) {            
            if (str1.substring(lena, lena + len2).equals(str2)) {
                count = lena;
                break;
            }            
        }
        System.out.println("Vị trí của chuỗi 2 là: " + count);
    }
}
