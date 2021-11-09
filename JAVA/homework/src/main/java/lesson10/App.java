package lesson10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0: Thoát chương trình.");
        System.out.println("1: In danh sách gốc.");
        System.out.println("2: In danh sách hàng giá hơn 100k.");
        System.out.println("3: Sắp xếp theo số hàng đã bán.");
        System.out.println("4: Món hàng bán chạy nhất.");
        System.out.println("5: Liệt kê hàng theo danh mục.");
        System.out.println("6: Tìm hàng theo tên.");
        System.out.println("Nhập công việc cần làm: ");
        int work = sc.nextInt();
        sc.nextLine();
        switch (work) {
        case 0:
            System.out.println("Chào tạm biệt.");
            break;
        case 1:
            StorageDTB.originallist();
            break;
        case 2:
            StorageDTB.product100k();
            break;
        case 3:
            StorageDTB.sortsold();
            break;
        case 4:
            StorageDTB.bestseller();
            break;
        case 5:
            StorageDTB.categorylisting();
            break;
        case 6:
            StorageDTB.search();
            break;
        }
        sc.close();
    }
}