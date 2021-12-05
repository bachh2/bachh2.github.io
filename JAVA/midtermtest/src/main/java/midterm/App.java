package midterm;
import java.util.Scanner;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public final class App {
  public static void main(String[] args) {    
    accountlist acclist = new accountlist();
    ArrayList<account> list = acclist.getData();
    Scanner sc = new Scanner(System.in);
    System.out.println("1 - Đăng nhập\n2 - Đăng ký");
    int job = sc.nextInt();
    switch (job) {
      case 1:
        Login.logon();
        break;
      case 2:
        Signup.signUp();
        break;
    }
    sc.close();
  }
}
