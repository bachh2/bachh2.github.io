import java.util.Scanner;

public class Bt61 {
    public static void SingleArray(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] narray;
        narray = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            sc.nextLine();
            narray[i] = temp;
        }
        
        int tempmax = narray[0];      
        for (int j = 0; j < n; j++)
        {
            if (tempmax < narray[j]) {
                tempmax = narray [j];           
            }            
        }
        
        int tempmin = narray[0];
        for (int k = 0; k < n; k++) {
            if (tempmin >narray[k]) {
                tempmin = narray[k];
            } 
            
        }
        System.out.println("Các phần tử của mảng: ");
        for (int l = 0; l < n; l++)
        {
            System.out.println(narray[l]);
        }
        System.out.println("Số lớn nhất là: " + tempmax);
        System.out.println("Số nhỏ nhất là: " + tempmin);
        sc.close();
    }
        
    }

