package homework;

import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class rosterDTB {
    public ArrayList<roster> getData() {
        ArrayList<roster> squad = new ArrayList<>();
        try {
            Gson gson = new Gson();
            FileReader reader = new FileReader("JAVA/extrawork/src/main/java/homework/roster.json");
            Type objectType = new TypeToken<ArrayList<roster>>() {
            }.getType();
            squad = gson.fromJson(reader, objectType);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return squad;
    }

    public static void printPosition() {
        rosterDTB newSquad = new rosterDTB();
        ArrayList<roster> list = newSquad.getData();
        Scanner sc = new Scanner(System.in);
        System.err.println("1: Sắp xếp theo số áo.");
        System.err.println("2: Sắp xếp theo tên.");
        System.err.println("3: Sắp xếp theo vị trí.");
        System.out.println("Nhập mục để sắp xếp: ");
        int prt = sc.nextInt();
        sc.nextLine();
        if (prt < 0 || prt > 3) {
            System.out.println("Bạn đã nhập sai tính năng.");
        } else
            switch (prt) {
            case 1:
                Collections.sort(list, new Comparator<roster>() {
                    @Override
                    public int compare(roster p1, roster p2) {
                        return p1.id - p2.id;
                    }
                });
                for (roster p : list) {
                    p.display();
                }
                break;
            case 2:
                Collections.sort(list, new Comparator<roster>() {
                    @Override
                    public int compare(roster p1, roster p2) {
                        return p1.name.compareTo(p2.name);
                    }
                });
                for (roster p : list) {
                    p.display();
                }
                break;
            case 3:
                Collections.sort(list, new Comparator<roster>() {
                    @Override
                    public int compare(roster p1, roster p2) {
                        return p1.position.compareTo(p2.position);
                    }
                });
                for (roster p : list) {
                    p.display();
                }
                break;
            }
        sc.close();
    }

    public static void RandomSquad() {
        rosterDTB newSquad = new rosterDTB();
        ArrayList<roster> list = newSquad.getData();
        Scanner sc = new Scanner(System.in);
        System.err.println("Nhập đội hình của bạn: ");
        System.out.println("Số hậu vệ: ");
        int back = sc.nextInt();
        sc.nextLine();
        System.out.println("Số tiền vệ: ");
        int mid = sc.nextInt();
        sc.nextLine();
        System.out.println("Số tiền đạo: ");
        int front = sc.nextInt();
        sc.nextLine();
        if (back + mid + front != 10) {
            System.out.println("Đội hình nhập sai");
        } else
            Collections.shuffle(list);
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (roster p : list) {
            
            if (p.position == position.GK) {
                System.out.println(p);
                count++;
            }
            if (count == 1) {                
                break;
            }
        }
        for (roster p : list) {
            
            if (p.position == position.DF) {
                System.out.println(p);
                count1++;
            }
            if (count1 == back) {
                break;
            }
        }
        for (roster p : list) {
            
            if (p.position == position.MF) {
                System.out.println(p);
                count2++;
            }
            if (count2 == mid) {
                break;
            }
        }
        for (roster p : list) {            
            if (p.position == position.FW) {
                System.out.println(p);
                count3++;
            }
            if (count3 == front) {
                break;
            }
        }
        sc.close();
    }

}
