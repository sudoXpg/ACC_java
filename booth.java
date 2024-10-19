public class booth{
    static int add(int a, int b) {
        return a + b;
    }
    // Booth's multiplication algorithm
    static void boothMultiplication(int multiplicand, int multiplier, int bitLength) {
        int A = multiplicand; // Multiplicand
        int Q = multiplier;   // Multiplier
        int Q_1 = 0;          // Extra bit to the right of Q (initialized to 0)
        int M = multiplicand; // Copy of multiplicand
        int count = bitLength;

        // Perform the algorithm
        while (count > 0) {
            int Q0 = Q & 1; // Least significant bit of Q

            if (Q0 == 1 && Q_1 == 0) {
                A = add(A, -M); // A = A - M
            } else if (Q0 == 0 && Q_1 == 1) {
                A = add(A, M);  // A = A + M
            }

            // Arithmetic right shift of A, Q, and Q_1
            int combined = (A << (bitLength + 1)) | (Q << 1) | Q_1;
            combined >>= 1;
            A = combined >> (bitLength + 1);
            Q = (combined >> 1) & ((1 << bitLength) - 1);
            Q_1 = combined & 1;

            count--;
        }

        System.out.println("Product: " + A + " " + Q);
    }

    public static void main(String[] args) {
        int multiplicand = 3; // Example multiplicand
        int multiplier = 4;   // Example multiplier
        int bitLength = 4;    // Assuming 4-bit numbers for simplicity

        boothMultiplication(multiplicand, multiplier, bitLength);
    }
}

