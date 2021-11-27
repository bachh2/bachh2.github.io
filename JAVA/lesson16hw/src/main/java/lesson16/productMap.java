package lesson16;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class productMap {

    public static void printBrand() {
        productReader newproduct = new productReader();
        ArrayList<product> list = newproduct.getData();
        Map<String, Integer> listBrand = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            String brandKey = list.get(i).getBrand();
            if (listBrand.get(brandKey) == null) {
                listBrand.put(brandKey, 1);
            } else {
                listBrand.put(brandKey, listBrand.get(brandKey) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : listBrand.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void printCategory() {
        productReader newproduct = new productReader();
        ArrayList<product> list = newproduct.getData();
        Map<category, Integer> listCategory = new HashMap<>();

        for (int j = 0; j < list.size(); j++) {
            category CatKey = list.get(j).getCategory();
            if (listCategory.get(CatKey) == null) {
                listCategory.put(CatKey, 1);
            } else {
                listCategory.put(CatKey, listCategory.get(CatKey) + 1);
            }
        }

        for (Map.Entry<category, Integer> entry1 : listCategory.entrySet()) {
            System.out.println(entry1.getKey() + " - " + entry1.getValue());
        }
    }

    public static void searchItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm cần tìm:");
        String prod = sc.nextLine();
        productReader newproduct = new productReader();
        ArrayList<product> list = newproduct.getData();
        Map<String, Integer> listsearch = new HashMap<>();
        listsearch.put(prod, 0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().toLowerCase().indexOf(prod.toLowerCase()) > -1) {
                listsearch.put(prod, listsearch.get(prod) + 1);
            }
        }
        System.out.println("Số sản phẩm tìm được là: " + listsearch.get(prod));
        if (listsearch.get(prod) > 0) {
            System.out.println("Danh sách các sản phẩm tìm được: ");
            for (product p : list) {
                if (p.getName().toLowerCase().indexOf(prod.toLowerCase()) > -1) {
                   System.out.println(p);
                }
            }
        }
        sc.close();
    }
    
}