public class SentenceFormat {
    public static void main(String[] args) {

        String sentence = "Java is easy to learn";

        // Split sentence into words
        String[] words = sentence.split(" ");

        // Rebuild the sentence in a new format
        String newSentence = "";

        for (String word : words) {
            newSentence = newSentence + word.toUpperCase() + "-";
        }

        // Remove the last "-"
        newSentence = newSentence.substring(0, newSentence.length() - 1);

        System.out.println("Original sentence: " + sentence);
        System.out.println("New format: " + newSentence);
    }
}
