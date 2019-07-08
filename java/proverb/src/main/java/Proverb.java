class Proverb {
private String[] words;
    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        String proverb = "";
        if(words.length != 0){
            String beginning = "";
            String ending =  "And all for the want of a " + words[0] + ".";
            for(int i = 0;i<words.length-1;i++)
                beginning += "For want of a "+ words[i] + " the " + words[i+1] + " was lost.\n";
            proverb = beginning + ending;
        }
        return proverb;
    }

}
