public class p3E {
    public static void main(String[] args) {
        int n1=21;
        int n2=6;
        while(n1>0 & n2>0){
            if(n1>n2){
                n1=n1%n2;
            }
            else{
                n2=n2%n1;
            }
        }

        if(n1==0){
            System.out.println(n2);
        }
        else{
            System.out.println(n1);
        }
    }
}
