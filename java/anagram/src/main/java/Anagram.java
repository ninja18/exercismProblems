import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    private String word;
    private String sortedWord;

    public Anagram(String word) {
        this.word = word.toLowerCase();
        sortedWord = sortString(this.word.toLowerCase());
    }

    public List<String> match(List<String> candidates) {
     List<String> matches = new ArrayList<>();

     for (String candidate : candidates){
        if ((!candidate.toLowerCase().equals(word)) && sortString(candidate.toLowerCase()).equals(sortedWord))
            matches.add(candidate);
     }
    return matches;
    }

    public String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();

        Arrays.sort(tempArray);

        return new String(tempArray);
    }
}
