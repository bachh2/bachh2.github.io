 class Bt51 {
    public static void Find() throws Exception {
        String str = "Hello every one";
        int i = 0;
        char e = 101;
        int count = 0;
        System.out.println("Index của e là: ");
        while (i < str.length()) {
            if (str.charAt(i) == e) {
                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println("Số e trong string là: "+count);
    }
    
}
