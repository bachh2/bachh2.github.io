package lesson16;

import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chương trình để thực hiện: ");
        System.out.println(
                " 1 - Liệt kê mỗi danh mục có bao nhiêu sản phẩm: \n 2 - Liệt kê mỗi hãng có bao nhiêu sản phẩm \n 3 - Tìm sản phẩm theo tên, liệt kê số lượng sản phẩm tìm được và in thông tin các sản phẩm đó ra màn hình: ");
        int bt = sc.nextInt();
        switch (bt) {
        case 1:
            productMap.printCategory();
            break;
        case 2:
            productMap.printBrand();
            break;
        case 3:
            productMap.searchItem();
            break;
        }
        sc.close();
    }
}
