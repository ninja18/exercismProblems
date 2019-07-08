import java.util.*;

class TwelveDays {
    private List<String> days;
    private List<String> gifts;

    public TwelveDays() {
        days = new ArrayList<>(
                Arrays.asList("first", "second", "third", "fourth",
                        "fifth", "sixth", "seventh", "eighth", "ninth",
                        "tenth", "eleventh", "twelfth"));
        gifts = new ArrayList<>(
                Arrays.asList("a Partridge in a Pear Tree.\n",
                        "two Turtle Doves, and ", "three French Hens, ",
                        "four Calling Birds, ", "five Gold Rings, ",
                        "six Geese-a-Laying, ", "seven Swans-a-Swimming, ",
                        "eight Maids-a-Milking, ", "nine Ladies Dancing, ",
                        "ten Lords-a-Leaping, ", "eleven Pipers Piping, ",
                        "twelve Drummers Drumming, "));
    }

    String verse(int verseNumber) {
        String firstPart = "On the ";
        firstPart += days.get(verseNumber - 1);
        firstPart += " day of Christmas my true love gave to me: ";
        String secondPart = "";
        int index = 1;

        for (String gift : gifts) {
            if (index > verseNumber) break;
            secondPart = gift + secondPart;
            index++;
        }
        return firstPart + secondPart;
    }


    String verses(int startVerse, int endVerse) {
        String song = "";
        for (int i = startVerse; i < endVerse; i++)
            song += verse(i) + "\n";
        song += verse(endVerse);
        return song;
    }


    String sing() {
        return verses(1, 12);
    }

}
