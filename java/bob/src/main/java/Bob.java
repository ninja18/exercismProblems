import static java.lang.Character.isUpperCase;

public class Bob {
    public String hey(String message) {
        String cleanMessage = message.replaceAll("[^a-zA-Z?]","");
        String messageWithNumbers = message.replaceAll("[^a-zA-Z0-9]","");

        if(!message.isEmpty() && !messageWithNumbers.isEmpty() && cleanMessage.isEmpty())
            return "Whatever.";

        if (cleanMessage.isEmpty())
            return "Fine. Be that way!";

        boolean isQuestion = checkForQuestion(cleanMessage);
        boolean isYell = checkForYell(cleanMessage);

        if (isQuestion && isYell)
            return "Calm down, I know what I'm doing!";
        if (isQuestion)
            return "Sure.";
        if (isYell)
            return "Whoa, chill out!";
        return "Whatever.";
    }

    private boolean checkForYell(String cleanMessage) {

        if(cleanMessage.length() < 2 && cleanMessage.charAt(cleanMessage.length() - 1) == '?')
            return false;

        for (char ch: cleanMessage.toCharArray()){
           if(ch != '?' && !isUpperCase(ch))
               return false;
        }

       return true;
    }

    private boolean checkForQuestion(String cleanMessage) {
        if(cleanMessage.charAt(cleanMessage.length()-1) == '?')
            return true;
        return false;
    }
}
