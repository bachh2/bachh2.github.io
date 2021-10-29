import java.util.Scanner;

public class E7 {    
    public static void Array2() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng: ");
        int row = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập số cột: ");
        int col = sc.nextInt();
        sc.nextLine();
        String [][] Array2d;
        Array2d = new String[row][col];
        
        for (int i = 0; i<row;i++)
        {
            for (int k = 0; k < col; k++) {
                System.out.printf("Nhập phần tử vị trí %d - %d %n", i, k);
                String tempstr = sc.nextLine();
                Array2d[i][k] = tempstr;
            }
        }

        System.out.println("Các phần tử của mảng: ");
        for (int l = 0; l < row; l++) {
            System.out.printf("%n Phần tử dòng %d: \n ", l);
            for (int m = 0; m < col; m++) {
                System.out.printf("%s \t",Array2d[l][m]);
            }
        }
        if (col == row) {
            System.out.println("\n Các phần tử trên đường chéo chính: ");
            for (int n = 0; n < col; n++) {
                System.out.println(Array2d[n][n]);

            }
        } else if (col != row) {
            System.out.println("Không có đường chéo chính");
        }
        sc.close();
    }
}


