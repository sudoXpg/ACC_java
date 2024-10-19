
public class LexicographicallyFirstPalindrome {
    public static String findLexicographicallyFirstPalindrome(String s) {
        int[] freq = new int[26];  // To store frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;  // Count the frequency of each character
        }

        int oddCount = 0;
        char oddChar = '\0';  // To store the character with odd frequency, if any
        
        // Step 1: Check if we can form a palindrome
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
                oddChar = (char) (i + 'a');  // Store the odd character
            }
            if (oddCount > 1) {
                return "no palindromic string";  // More than one odd character makes it impossible
            }
        }

        // Step 2: Form the first half of the palindrome
        StringBuilder firstHalf = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                for (int j = 0; j < freq[i] / 2; j++) {
                    firstHalf.append((char) (i + 'a'));
                }
            }
        }

        // Step 3: Create the full palindrome
        String secondHalf = new StringBuilder(firstHalf).reverse().toString();
        if (oddCount == 1) {
            return firstHalf.toString() + oddChar + secondHalf;  // Insert the odd character in the middle
        } else {
            return firstHalf.toString() + secondHalf;  // Just mirror the first half
        }
    }

    public static void main(String[] args) {
        String s = "apple";  // Example input
        String result = findLexicographicallyFirstPalindrome(s);
        System.out.println(result);  // Outputs the palindrome or the error message
    }
}
