import java.util.regex.Pattern;

public class Palindrome {
    public boolean check(String sentence) {
        if(sentence.isEmpty())
            return true;

        String cleanSentence = sentence.replaceAll("[ ]","").toLowerCase();
        int cleanSentenceLength = cleanSentence.length();

        if(cleanSentence.replaceAll("[^a-zA-Z]","").length() != cleanSentenceLength)
            return false;

        for (int i = 0; i < cleanSentenceLength/2; i++) {
            if(cleanSentence.charAt(i) != cleanSentence.charAt(cleanSentenceLength-i-1))
                return false;
        }
        return true;
    }
}
