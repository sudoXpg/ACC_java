public class p8maxProd {
    
    static int prodMax(int []arr){
        if(arr.length==1){
            return arr[0];
        }
        int maxProduct=arr[0];
        int minProduct=arr[0];
        int res=arr[0];

        int tmp;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]<0){
                tmp=maxProduct;
                maxProduct=minProduct;
                minProduct=tmp;
            }

            maxProduct=Math.max(arr[i],maxProduct*arr[i]);
            minProduct=Math.min(minProduct*arr[i], arr[i]);
            res=Math.max(res,maxProduct);
        }

        return Math.max(maxProduct,res);
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,0,-1,13,124};
        int n=prodMax(arr);
        System.out.println(n);
    }
}
