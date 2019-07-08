public class PangramChecker {

    public boolean isPangram(String input) {
        String cleanInput = input.replaceAll("[^A-Za-z]","").toLowerCase();
        if(cleanInput.length() < 26)
            return false;
        String regex = "(?i)(?=.*a)(?=.*b)(?=.*c)(?=.*d)(?=.*e)(?=.*f)"
                + "(?=.*g)(?=.*h)(?=.*i)(?=.*j)(?=.*k)(?=.*l)(?=.*m)(?=.*n)"
                + "(?=.*o)(?=.*p)(?=.*q)(?=.*r)(?=.*s)(?=.*t)(?=.*u)(?=.*v)"
                + "(?=.*w)(?=.*x)(?=.*y)(?=.*z).*";

        if(cleanInput.matches(regex))
            return true;
        return false;
    }

}
