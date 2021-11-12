package homework;

import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class productReader {
    public ArrayList<product> getData() {
        ArrayList<product> productInfo = new ArrayList<>();
        try {
            Gson gson = new Gson();

            FileReader reader = new FileReader("JAVA/lesson11a5/src/main/java/homework/product.json");

            Type objectType = new TypeToken<ArrayList<product>>() {
            }.getType();

            productInfo = gson.fromJson(reader, objectType);

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return productInfo;
    }

    public static void printCategory() {
        productReader newproduct = new productReader();
        ArrayList<product> list = newproduct.getData();
        System.out.println("Mã số danh mục:");
        System.out.println("1: Điện thoại");
        System.out.println("2: Apple");
        System.out.println("3: Laptop");
        System.out.println("4: Phụ kiện");
        System.out.println("Nhập mã số danh mục bạn muốn in: ");
        Scanner sc = new Scanner(System.in);
        int scan = sc.nextInt();
        sc.nextLine();
        for (product p : list) {
            if (p.getCategory() == category.values()[scan - 1]) {
                System.out.println(p);
            }
        }
        sc.close();
    }

    public static void printBrand() {
        productReader newproduct = new productReader();
        ArrayList<product> list = newproduct.getData();
        System.out.println("Nhập tên nhãn hàng: ");
        Scanner sc = new Scanner(System.in);
        String bran = sc.nextLine();
        for (product p : list) {
            if (p.getBrand() == bran) {
                System.out.println(p);
            }
        }
        sc.close();
    }

    public static void printPriceCat() {
        productReader newproduct = new productReader();
        ArrayList<product> list = newproduct.getData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Các mức giá: ");
        System.out.println("1: Dưới 2 triệu.");
        System.out.println("2: 2-4 triệu.");
        System.out.println("3: 4-7 triệu.");
        System.out.println("4: 7-13 triệu.");
        System.out.println("5: Trên 13 triệu.");
        System.out.println("Nhập mức giá: ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.println("Mã số danh mục:");
        System.out.println("1: Điện thoại");
        System.out.println("2: Apple");
        System.out.println("3: Laptop");
        System.out.println("4: Phụ kiện");
        System.out.println("Nhập mã số danh mục bạn muốn in: ");
        int cate = sc.nextInt();
        sc.nextLine();
        switch (price) {
        case 1:
            for (product p : list) {
                if (p.getPrice() < 2000000 && p.getCategory() == category.values()[cate - 1]) {
                    System.out.println(p);
                }
            }
            break;
        case 2:
            for (product p : list) {
                if (2000000 <= p.getPrice() && p.getPrice() < 4000000
                        && p.getCategory() == category.values()[cate - 1]) {
                    System.out.println(p);
                }
            }
            break;
        case 3:
            for (product p : list) {
                if (4000000 <= p.getPrice() && p.getPrice() < 7000000
                        && p.getCategory() == category.values()[cate - 1]) {
                    System.out.println(p);
                }
            }
            break;
        case 4:
            for (product p : list) {
                if (7000000 <= p.getPrice() && p.getPrice() < 13000000
                        && p.getCategory() == category.values()[cate - 1]) {
                    System.out.println(p);
                }
            }
            break;
        case 5:
            for (product p : list) {
                if (13000000 <= p.getPrice() && p.getCategory() == category.values()[cate - 1]) {
                    System.out.println(p);
                }
            }
            break;
        }

        sc.close();
    }

    public static void search() {
        productReader newproduct = new productReader();
        ArrayList<product> list = newproduct.getData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập món hàng cần tìm: ");
        String prod = sc.nextLine();
        for (product p : list) {
            if (p.getName().indexOf(prod) > -1) {
                System.out.println(p);
            }
        }
        sc.close();
    }

}
