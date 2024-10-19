import java.util.*;
public class leader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int []arr = new int[k];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(arr[arr.length-1]);
        System.err.print(" ");
        int lead1=arr[arr.length-1];
        for(int i=arr.length-1;i!=0;i--){
            if(arr[i]>lead1){
                System.out.print(arr[i]+" ");
                lead1=arr[i];

            }
        }
        sc.close();
    }
}
