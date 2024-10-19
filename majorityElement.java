public class majorityElement{
    public static void main(String[] args) {
        int []arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int []hash = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]+=1;
        }

        int maxFreq=0;
        int maxValue=-1;
        for(int i=0;i<arr.length;i++){
            if(hash[i]>maxFreq){
                maxFreq=hash[i];
                maxValue=i;
            }
        }

        if(maxFreq>=arr.length/2){
            System.out.println(maxValue);
        }
    }
}