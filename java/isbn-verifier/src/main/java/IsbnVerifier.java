class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        int ISBNSize = 10;
        char[] cleanISBN = stringToVerify.replaceAll("[^0-9X]","").toCharArray();
        if (cleanISBN.length != ISBNSize) return false;
        int sum = 0;
        int scale = 10;
        while (scale>1){
            if(cleanISBN[ISBNSize-scale] == 'X')
                return false;
            sum += (scale*(((int) cleanISBN[ISBNSize-scale] - 48)));
            scale--;
        }
        sum += (scale*((cleanISBN[ISBNSize-scale] == 'X')?10:((int)cleanISBN[10-scale]-48)));
        return (sum%11) == 0;
    }

}
