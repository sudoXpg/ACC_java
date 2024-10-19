class FlippingOnes {
    public static int findMaxConsecutiveOnes(int[] arr, int k) {
        int windowStart = 0, maxLength = 0, zerosInWindow = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            // Count the zeros in the current window
            if (arr[windowEnd] == 0) {
                zerosInWindow++;
            }
            
            // If the number of zeros exceeds k, slide the window forward
            while (zerosInWindow > k) {
                if (arr[windowStart] == 0) {
                    zerosInWindow--;
                }
                windowStart++;
            }
            
            // Update the maximum length found
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0};
        int k = 1;
        System.out.println("Max consecutive ones after flipping: " + findMaxConsecutiveOnes(arr, k));
    }
}
