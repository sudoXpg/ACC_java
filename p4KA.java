public class p4KA {

    public static int kara(int n1,int n0){
        if(n1<10||n0<10){
            return n1*n0;
        }
        int len=Math.max(Integer.toString(n1).length(), Integer.toString(n0).length());
        len/=2;

        int high1,low1,high0,low0;

        high1=n1/(int)Math.pow(10, len);
        low1=n1%(int)Math.pow(10,len);
        high0=n0/(int)Math.pow(10, len);
        low0=n0%(int)Math.pow(10,len);

        int z0=kara(low1,low0);
        int z1=kara((low0+high0),(low1+high1));
        int z2=kara(high1,high0);

        return z2*(int) Math.pow(10,len*2) +(z1-z2-z0)*(int) Math.pow(10,len)+ z0;

    }
    public static void main(String[] args) {
        System.out.println(kara(22,33));
        
    }
}
