//import java.util.*;
public class blockSwap {
    public static void rotate(int [] arr, int k){
        k=k%arr.length;
        reverse(arr,0, arr.length-1);
        reverse(arr,0, k-1);
        reverse(arr, k, arr.length-1);

    }

    public static void reverse(int [] arr, int start, int end){
        while(start<end){
            int tmp=arr[start];
            arr[start]=arr[end];
            arr[end]=tmp;
            start++;
            end--;
        }
    }

    public static void main(String[]args){
        int [] arr = {1,2,3,4,5};
        int k=2;
        rotate(arr, k);
        System.out.println(arr[0]);
    }
}
