package lesson15;

import java.util.ArrayList;

public class GenericAdd {
    ArrayList<Kitchen> list1;
    ArrayList<Waiter> list2;

    public ArrayList<Kitchen> getKitchen() {
        var listKitchen = new ArrayList<Kitchen>();
        listKitchen.add(new Kitchen(1, "Toang", 43, 10000000, 600000));
        listKitchen.add(new Kitchen(2, "Tan", 34, 10000000, 700000));
        listKitchen.add(new Kitchen(3, "Ton", 27, 10000000, 500000));
        return listKitchen;
    }

    public ArrayList<Waiter> getWaiter() {
        var listWaiter = new ArrayList<Waiter>();
        listWaiter.add(new Waiter(1, "Toang", 23, 10000000, 800000));
        listWaiter.add(new Waiter(2, "Tong", 33, 11000000, 800000));
        listWaiter.add(new Waiter(3, "Tang", 22, 12000000, 800000));
        return listWaiter;
    }

}
