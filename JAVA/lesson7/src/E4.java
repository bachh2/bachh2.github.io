 class E4 {
    public static void counting() throws Exception {
        String str = "You only live once, but if you do it right, once is enough";
        char space = 32;
        int count = 1;
        for (int i = 0; i<str.length(); i++)
        {            
            if (str.charAt(i) == space) {
                count++;
            }
        }
        System.out.println("Số từ trong câu là: " + count);
        char o = 111;
        int counto = 0;
        System.out.println("Index của o là: ");
        for (int k =0; k<str.length(); k++)
        {
            if (str.charAt(k) == o) {
                System.out.println(k);
                counto++;
            }
        }
        System.out.println("Số ký tự o là: "+counto);
        }
        
        
    }

