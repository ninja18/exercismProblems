import java.util.ArrayList;
import java.util.List;

public class Series {
    private String number;

    public Series(String number) {
        this.number = number;
    }

    public List<String> slices(int slice) {
        if(number.length() < slice)
            throw new IllegalArgumentException("Slice size is too big.");
        if (slice<1)
            throw new IllegalArgumentException("Slice size is too small.");

        List<String> slices = new ArrayList<>();
        for(int i = 0;i<=number.length() - slice;i++)
            slices.add(number.substring(i,i+slice));

        return slices;
    }
}
