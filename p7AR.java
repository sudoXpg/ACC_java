public class p7AR {
    static void rotate(int []arr,int k){
        k=k%arr.length;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
    }
    static void reverse(int []arr,int start,int end){
        int tmp;
        while(start<end){
            tmp=arr[start];
            arr[start]=arr[end];
            arr[end]=tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        int k=2;
        rotate(arr,k);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
