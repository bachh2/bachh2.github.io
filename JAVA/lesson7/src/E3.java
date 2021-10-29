public class E3 {

    public static void primeten() throws Exception {
        System.out.println("Số nguyên tố trong 10 số đầu tiên: ");

        for (int i = 2; i < 10; i++) {
            int count = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
    
    public static void firsttenprime() throws Exception {
        System.out.println("10 số nguyên tố đầu tiên: ");
        int count1 = 0;
        for (int i = 2; i < 100; i++) {
            int count = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
                count1++;
                if (count1==10) {break;}
            }
        }
    }
}
