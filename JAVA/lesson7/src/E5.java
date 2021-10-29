public class E5 {
    public static void SoNguyenTo() throws Exception {
        int n = (int) (Math.random() * 1000);

        System.out.println("Số ngẫu nhiên là: " + n);
        if (n <= 2) {
            System.out.println("Không phải số nguyên tố");
        }
        if (n > 2) {
            int count = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Là số nguyên tố");
            } else {
                System.out.println("Không phải số nguyên tố");
            }
        }
    }
}
