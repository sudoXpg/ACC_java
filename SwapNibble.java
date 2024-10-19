import java.util.*;

public class SwapNibble{
    public static void main(String[]args){
        System.out.print("Enter the two numbers : ");
        Scanner sc = new Scanner(System.in);
        int n1;
        n1=sc.nextInt();
        int swapped = ((n1&0xF)<<4)|((n1%0xF0)>>4);
        System.out.println("number : "+n1+"\nSwapped : "+swapped);
        sc.close();

    }
}