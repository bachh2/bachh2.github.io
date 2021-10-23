import java.util.Scanner;

class Bt53 {
    public static void FindLongest() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();
        sc.close();
        int count = 0;
        int len = 0;
        String longest = null;

        while (str.isEmpty() == false) {
            str = str.trim().concat(" ");
            count = str.indexOf(" ");
            if (count < 0) {
                break;
            }
            String cut = str.substring(0, count);
            if (cut.length() > len) {
                longest = cut;
            }
            len = longest.length();
            str = str.substring(count + 1);

        }
        System.out.println("Từ dài nhất là: " + longest);

    }
}
        