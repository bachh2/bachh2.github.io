import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cân nặng theo kg: ");
        float weight = sc.nextFloat();
        System.out.println("Nhập chiều cao theo m: ");
        float height = sc.nextFloat();

        float bmi = weight / (height * height);
        System.out.println("BMI là: "+ bmi);
    }
}
