package codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JadenCase {

    public String toJadenCase(String phrase) {

try {
    Pattern pattern = Pattern.compile("\\b([a-z])");
    Matcher matcher = pattern.matcher(phrase);
    if(phrase.isBlank()|| phrase.equals("")){
        return null;
    }else {
        return matcher.replaceAll(match -> match.group(1).toUpperCase());
    }
}catch (NullPointerException e){
    return null;
}
    }

    public static void main(String[] args) {
        JadenCase jd = new JadenCase();
        jd.toJadenCase(null);


    }
}