import java.util.Scanner;

class Bt3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số x: ");
        int x = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập số y: ");
        int y = sc.nextInt();

        int sum = x + y;
        int minus = x - y;
        long mul = x * y;
        float x1 = x;
        float y1 = y;
        float div = x1 / y1;
        System.out.println("Tổng x và y là: " + sum);
        System.out.println("Hiệu x và y là: " + minus);
        System.out.println("Tích x và y là: " + mul);
        System.out.println("Thương số x và y là: " + div);
        sc.close();
        };
    }

