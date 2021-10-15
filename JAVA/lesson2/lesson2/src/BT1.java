public class BT1 {
    public static void main(String[] args) throws Exception {
        String s = "học lập trình java không khó";

        String s1 = s.replace("khó", "dễ");
        String s2 = s.replace('k', 'K');
       
        System.out.println("Độ dài chuỗi là: " + s.length());
        System.out.println("Vị trí của chữ j là: " + s.indexOf('j'));
        System.out.println("Thay thế chữ khó thành dễ: " + s1);
        System.out.println("Thay tất cả chữ k thành in hoa: " + s2);

        BT2 enum1 = BT2.Friday;
        System.out.println("enum ngày trong tuần: " + enum1);

        String s4 = s.substring(0,1);
        String s5 = s.substring(1,27);
        String s6 = s.substring(27,28);
        
        System.out.println("In hoa 2 chữ cái đầu và cuối câu: "+ s4.toUpperCase()+s5+s6.toUpperCase());
    }
}
