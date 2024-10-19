import java.util.*;
public class p4KA1{
    public static int[] multiplyPolynomials(int[] poly1, int[] poly2) {
        int[] result = new int[poly1.length + poly2.length - 1];
        
        for (int i = 0; i < poly1.length; i++) {
            for (int j = 0; j < poly2.length; j++) {
                result[i + j] += poly1[i] * poly2[j];
            }
        }     
        return result;
    }

    public static void main(String[] args) {
        int[] poly1 = {1, 2, 3};
        int[] poly2 = {4, 5, 6};
        int[] result = multiplyPolynomials(poly1, poly2);
        System.out.println(Arrays.toString(result));
    }
}
