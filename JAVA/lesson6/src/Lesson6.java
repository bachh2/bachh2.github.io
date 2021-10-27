import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nhập bài tập: ");
        Scanner sc = new Scanner(System.in);
        int hw = sc.nextInt();
        sc.nextLine();
        switch (hw) {
        case 1:
            Bt61.SingleArray(args);
            break;
        case 2:
            Bt62.MultiArray(args);
            break;
        }
        sc.close();
    }
}
