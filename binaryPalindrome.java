import java.util.Scanner;

class binaryPalindrome 
{
    public static int binPalindomeCheck(int n){
        String bin = Integer.toBinaryString(n);
        System.out.println("The binary value is : "+bin);
        int i=0;
        int j=bin.length()-1;
        while(i<j){
            if(bin.charAt(i)!=bin.charAt(j)){
                return -1;
            }
            i++;
            j--;
        }
        return 0;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int inp = sc.nextInt();
        if(binPalindomeCheck(inp)==-1){
            System.out.println("NOT");
        }
        else{
            System.out.println("YES");
        }
        sc.close();

    }    
    
}