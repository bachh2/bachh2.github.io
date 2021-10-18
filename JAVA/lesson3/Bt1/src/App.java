import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int randnum = random.nextInt();
        System.out.println("Số ngẫu nhiên là: " + randnum);
        
        String test = randnum % 2 == 0 ? "Số ngẫu nhiên là chẵn" : "Số ngẫu nhiên là lẻ";
        System.out.println(test);
    }
}
