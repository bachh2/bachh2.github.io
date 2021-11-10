package homework;

public class App {
    public static void main(String[] args) throws Exception {
        Waiter wt = new Waiter(12, "Quang", 20, 10000, 3000);
        wt.display();
        Kitchen kc = new Kitchen(13, "Hải", 32, 20000, 5000);
kc.display();
    }
}