package lesson10;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StorageDTB {
    public ArrayList<Storage> getData() {
        ArrayList<Storage> StorageData = new ArrayList<>();
        try {
            Gson gson = new Gson();
            FileReader reader = new FileReader("JAVA/homework/src/main/java/lesson10/homework.json");
            Type objectType = new TypeToken<ArrayList<Storage>>() {
            }.getType();
            StorageData = gson.fromJson(reader, objectType);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return StorageData;

    }

    public static void originallist() {
        StorageDTB Storagedata = new StorageDTB();
        ArrayList<Storage> list = Storagedata.getData();
        System.out.println("Danh sách ban đầu: ");
        for (Storage s : list) {
            s.display();
        }
    }

    public static void product100k() {
        StorageDTB Storagedata = new StorageDTB();
        ArrayList<Storage> list = Storagedata.getData();
        System.out.println("Các sản phẩm giá trên 100.000: ");
        for (Storage p : list) {
            if (p.getprice() > 100) {
                p.display();
            }
        }
    }

    public static void sortsold() {
        StorageDTB Storagedata = new StorageDTB();
        ArrayList<Storage> list = Storagedata.getData();
        System.out.println("Sắp xếp sản phẩm theo số lượng bán được: ");
        Collections.sort(list);
        for (Storage s : list) {
            s.display();
        }

    }

    public static void bestseller() {
        StorageDTB Storagedata = new StorageDTB();
        ArrayList<Storage> list = Storagedata.getData();
        Collections.sort(list);
        System.out.println("Sản phẩm bán chạy nhất: ");
        list.get(list.size() - 1).display();
    }

    public static void categorylisting() {
        StorageDTB Storagedata = new StorageDTB();
        ArrayList<Storage> list = Storagedata.getData();
        System.out.println("Sản phẩm theo danh mục: ");
        System.out.println("Đồ gia dụng: ");
        for (Storage s : list) {
            if (s.getcategory() == category.appliance) {
                s.display();
            }
        }
        System.out.println("Thời trang: ");
        for (Storage s : list) {
            if (s.getcategory() == category.fashion) {
                s.display();
            }
        }
        System.out.println("Mỹ phẩm: ");
        for (Storage s : list) {
            if (s.getcategory() == category.beauty) {
                s.display();
            }
        }
        System.out.println("Thực phẩm: ");
        for (Storage s : list) {
            if (s.getcategory() == category.food) {
                s.display();
            }
        }
    }

    public static void search() {
        StorageDTB Storagedata = new StorageDTB();
        ArrayList<Storage> list = Storagedata.getData();
        System.out.println("Nhập tên sản phẩm cần tìm: ");
        Scanner sc = new Scanner(System.in);
        String prodsearch = sc.nextLine();
        for (Storage s : list) {
            if (s.getproduct().indexOf(prodsearch) > -1) {
                s.display();
            }
        }
        sc.close();

    }
}
