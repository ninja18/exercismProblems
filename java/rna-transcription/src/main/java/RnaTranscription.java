import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class RnaTranscription {
    private Map<Character, Character> nucleotideMap;

    public RnaTranscription() {
        nucleotideMap = new HashMap<>();
        nucleotideMap.put('G','C');
        nucleotideMap.put('C','G');
        nucleotideMap.put('T','A');
        nucleotideMap.put('A','U');
    }

    String transcribe(String dnaStrand) {
        String RNA = "";

        for (char ch:dnaStrand.toCharArray()) {
            RNA += nucleotideMap.get(ch);
        }

        return RNA;
    }


}
