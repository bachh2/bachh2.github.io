import java.util.Scanner;

public class Exercise
 {
     public static void main(String[] args) throws Exception {
         System.out.println("Danh sách bài tập: ");
         System.out.println("1- Bài 1: Vẽ");
         System.out.println("2- Bài 2: Chuẩn hóa tên");
         System.out.println("3- Bài 2: Palindrome");
         System.out.println("4- Bài 3: Số nguyên tố <10");
         System.out.println("5- Bài 3: 10 số nguyên tố đầu tiên");
         System.out.println("6- Bài 4: Đếm từ");
         System.out.println("7- Bài 5: Số ngẫu nhiên");
         System.out.println("8- Bài 6: Check email");
         System.out.println("9- Bài 7: Mảng");
         
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bài tập để thực hiện: ");
        int bt = sc.nextInt();
        sc.nextLine();
        switch (bt) {
        case 1: 
            E1.Draw();
            break;
        case 2:
            E2.NameCheck();
            break;
        case 3:
            E2.StringCheck();
            break;
        case 4:
            E3.primeten();
            break;
        case 5:
            E3.firsttenprime();
            break;
        case 6:
            E4.counting();
            break;
        case 7:
            E5.SoNguyenTo();
            break;
        case 8:
            E6.Email();
            break;
        case 9:
            E7.Array2();
            break;
        }
       sc.close();
    }
}
