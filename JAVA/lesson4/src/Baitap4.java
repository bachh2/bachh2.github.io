import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn bài tập để thực hiện");
        int bt = sc.nextInt();

        switch (bt) {
            case 1:
                Bt41.Triangle();
                break;
            case 2:
                Bt42.DTB();
                break;
            case 3:
                Bt43.PT();
                break;

        }
        sc.close();
    }
}   