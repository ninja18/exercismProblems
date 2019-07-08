import java.util.HashMap;
import java.util.Map;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        Map<Character,Integer> characterTracker = new HashMap<>();
        char[] cleanPhrase = phrase.replaceAll("[- ]","").toLowerCase().toCharArray();
        for(char ch : cleanPhrase){
            if(characterTracker.get(ch) != null) return false;
            characterTracker.put(ch,1);
        }
        return true;
    }

}
