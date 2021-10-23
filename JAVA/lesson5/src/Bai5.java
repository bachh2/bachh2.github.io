import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        System.out.println("Chọn bài tập để thực hiện");
        int bt = sc.nextInt();

        switch (bt) {
            case 1:
                Bt51.Find();;
                break;
            case 2:
                Bt52.FindString();
                break;
            case 3:
                Bt53.FindLongest();
                break;

        }
        sc.close();
    }
}