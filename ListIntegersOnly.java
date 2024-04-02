package codewars;

import java.util.List;
import java.util.stream.Collectors;

public class ListIntegersOnly {

    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out

        //return list.stream().filter(s -> Pattern.matches("^\\d+", s.toString())).collect(Collectors.toList());

        return list.stream().filter(s -> s instanceof Integer).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        filterList(List.of(1, 2, "f", "e", "5", "t"));
        System.out.println(filterList(List.of(1, 2, "f", "e", "5", "t")).toString());;
    }
}
