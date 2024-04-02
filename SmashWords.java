package codewars;
import java.util.Arrays;

public class SmashWords {

    public static String smash(String... words) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            sb.append(" ");
        }

        System.out.println(sb.toString().trim());

        return sb.toString().trim();
        //return String.join(" ", words);


    }

    public static void main(String[] args) {
        smash("one","two","dfsd", "werw");
    }
}