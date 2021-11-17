package homework;

import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chức năng: ");
        System.out.println("1: In đội hình theo sắp xếp.");
        System.out.println("2: In đội hình ngẫu nhiên.");
        System.out.println("0: Thoát chương trình.");
        int job = sc.nextInt();
        sc.nextLine();
        if (job > 2 || job < 0) {
            System.out.println("Bạn đã nhập sai");
        } else
            switch (job) {
            case 1:
                rosterDTB.printPosition();
                break;
            case 2:
                rosterDTB.RandomSquad();
                break;
            case 0:
                System.out.println("Tạm biệt");
                break;
            }
        sc.close();
    }
}
