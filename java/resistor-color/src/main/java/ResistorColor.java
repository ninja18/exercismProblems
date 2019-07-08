import java.util.ArrayList;
import java.util.List;

class ResistorColor {
    private String[] colorCode = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        for(int i  = 0; i<colorCode.length;i++){
            if(colorCode[i] == color)
                return i;
        }
        return -1;
    }


    String[] colors() {
        return colorCode;
    }
}
