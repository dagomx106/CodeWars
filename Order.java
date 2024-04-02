package codewars;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Order {
    public static String order(String words) {
        String[] part = words.split(" ");
        Character partChar = null;
        Map<Character, String> sentence = new HashMap<>();
        if (words.equals("")){
            return "";
        }else {
        for (int i = 0; i < part.length; i++) {
            for (int j = 0; j < part[i].length() ; j++) {
                partChar = part[i].charAt(j);
                if(Character.isDigit(partChar)){
                    sentence.put(partChar,part[i]);
                }
            }
        }}

        System.out.println(words);
        String str = sentence.entrySet().stream().map(e -> e.getValue())
                .collect(Collectors.joining(" "));
        System.out.println(str);


        return str;
    }

    public static void main(String[] args) {
        order("is2 Thi1s T4est 3a");
        order("4of Fo1r pe6ople g3ood th5e the2");
        order("");
    }
}