import java.util.Scanner;

public class E1 {
    public static void Draw() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn in hình vuông bằng số 1, in hình tam giác bằng số 2");
        int a = sc.nextInt();
        sc.nextLine();
        if (a >2)
        {
            System.out.println("Không hợp lệ");
        }
        switch (a) {
        case 1:
            for (int i = 0; i < 4; i++) {
                System.out.println("*\t*\t*\t*\n");
            }
            break;
        case 2:
            for (int i = 0; i < 5; i++) {
                for (int k = 0; k < i; k++) {
                    System.out.printf("*\t");
                }
                System.out.println("\n");
            }
            break;
        }
        sc.close();
    }
}
