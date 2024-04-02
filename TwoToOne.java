package codewars;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        String two = s1.concat(s2);
        System.out.println(two.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString());

        return two.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

    }

    public static void main(String[] args) {
        longest("sdfsaacffefvz", "mbfbngbunyyydecc");
    }
}
