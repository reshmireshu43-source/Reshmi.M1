import java.util.*;

public class AnagramGroups {

    public static void main(String[] args) {

        String[] words = {
            "cat", "act", "tac",
            "dog", "god",
            "bat"
        };

        HashSet<String> groups = new HashSet<>();

        for (String word : words) {

            // Convert word to character array
            char[] chars = word.toCharArray();

            // Sort the characters
            Arrays.sort(chars);

            // Create a common key for anagrams
            String key = new String(chars);

            groups.add(key);
        }

        System.out.println("Number of anagram groups: " + groups.size());
    }
}
