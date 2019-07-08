import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProteinTranslator {

    private Map<String, String> codonToProtein;

    public ProteinTranslator() {
        codonToProtein = new HashMap<String, String>() {
            {
                put("AUG", "Methionine");
                put("UUU", "Phenylalanine");
                put("UUC", "Phenylalanine");
                put("UUA", "Leucine");
                put("UUG", "Leucine");
                put("UCU", "Serine");
                put("UCC", "Serine");
                put("UCA", "Serine");
                put("UCG", "Serine");
                put("UAU", "Tyrosine");
                put("UAC", "Tyrosine");
                put("UGU", "Cysteine");
                put("UGC", "Cysteine");
                put("UGG", "Tryptophan");
                put("UAA", "STOP");
                put("UAG", "STOP");
                put("UGA", "STOP");
            }
        };
    }

    List<String> translate(String rnaSequence) {
        List<String> proteins = new ArrayList<String>();
        int index = 0;
        while (index <= rnaSequence.length() - 3) {
            String protein = codonToProtein.get(rnaSequence.substring(index, index + 3));
            if (protein.equals("STOP")) break;

            proteins.add(protein);
            index += 3;
        }
        return proteins;
    }
}