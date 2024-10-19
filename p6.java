public class p6 {
    public static void main(String[] args) {
        int n=67;
        int n1=(n&0xF)<<4|(n&0xF0)>>4;
        System.out.println(n+" "+n1);
    }
}
