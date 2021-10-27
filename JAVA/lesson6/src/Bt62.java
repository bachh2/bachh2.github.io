import java.util.Scanner;

public class Bt62 {
    public static void MultiArray(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[][] marray;
        marray = new String[n][3];
        for (int i = 0; i < n; i++)
        {
            for (int k = 0; k < 3; k++) {
                System.out.printf("Nhập thông tin phần tử thứ %d - %d ", i, k);
                String str = sc.nextLine();
                marray[i][k] = str;
            }
        }
        sc.close();
        for (int l = 0; l<n;l++){
            for (int m = 0; m<3;m++) {
                System.out.printf("Phần tử: %d - %d : %s %n",l,m,marray[l][m]);
            }
        }
    }
}


