package homework;
// import java.util.ArrayList;
import java.util.Scanner;

public class App {
       
    public static void main(String[] args) {
        // productReader newproduct = new productReader();
        // ArrayList<product> list = newproduct.getData();        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần việc cần thực hiện");
        int work = sc.nextInt();
        sc.nextLine();
        switch (work) {
        case 1:
            productReader.printCategory();
            break;
        case 2:
            productReader.printBrand();
            break;
        case 3:
            productReader.printPriceCat();
            break;
        case 4:
            productReader.search();
            break;
        }
        sc.close();
    }
}
