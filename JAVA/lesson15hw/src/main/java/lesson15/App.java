package lesson15;

import java.util.ArrayList;

public final class App {
   
    public static void main(String[] args) {
        ArrayList<? extends Employee> list;
        GenericAdd data = new GenericAdd();
        System.out.println("Danh sách nhân viên bếp: ");
        list = data.getKitchen();
        printList(list);
        System.out.println("Danh sách bồi bàn: ");
        list = data.getWaiter();
        printList(list);

    }
            
    public static void printList(ArrayList<? extends Employee> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
