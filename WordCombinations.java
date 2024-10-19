public class WordCombinations {

    public static void main(String[] args) {
        String word = "suvi";
        System.out.println("All combinations of the word \"" + word + "\":");
        generateCombinations(word, "", 0);
    }

    public static void generateCombinations(String word, String current, int index) {
        if (!current.isEmpty()) {
            System.out.println(current);
        }

        for (int i = index; i < word.length(); i++) {
            generateCombinations(word, current + word.charAt(i), i + 1);
        }
    }
}
