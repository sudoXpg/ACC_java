public class KaratsubaMultiplication {

    public static int karatsuba(int x, int y) {
        if (x < 10 || y < 10) return x * y;

        // Calculate the size of the numbers
        int n = Math.max(Integer.toString(x).length(), Integer.toString(y).length());
        int m = n / 2;

        // Split x and y into high and low parts
        int high1 = x / (int) Math.pow(10, m);
        int low1 = x % (int) Math.pow(10, m);
        int high2 = y / (int) Math.pow(10, m);
        int low2 = y % (int) Math.pow(10, m);

        // Recursive steps
        int z0 = karatsuba(low1, low2);       // low1 * low2
        int z1 = karatsuba((low1 + high1), (low2 + high2));  // (low1 + high1) * (low2 + high2)
        int z2 = karatsuba(high1, high2);     // high1 * high2

        // Return the result combining the three products
        return (z2 * (int) Math.pow(10, 2 * m)) + ((z1 - z2 - z0) * (int) Math.pow(10, m)) + z0;
    }

    public static void main(String[] args) {
        int x = Integer.parseInt("22");
        int y = Integer.parseInt("33");

        int result = karatsuba(x, y);
        System.out.println("Product: " + result);
    }
}
