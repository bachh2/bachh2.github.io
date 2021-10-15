public class BT1 {
    public static void main(String[] args) throws Exception {
        String s = "học lập trình java không khó";

        String s1 = s.replace("khó", "dễ");
        String s2 = s.replace('k', 'K');
       
        System.out.println("Độ dài chuỗi là: " + s.length());
        System.out.println("Vị trí của chữ j là: " + s.indexOf('j'));
        System.out.println("Thay thế chữ khó thành dễ: " + s1);
        System.out.println("Thay tất cả chữ k thành in hoa: " + s2);
    }
}
