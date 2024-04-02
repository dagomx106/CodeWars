package codewars;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {

        System.out.println(name.replaceAll("^([A-Za-z])\\w*\\s([a-zA-Z])\\w*$","$1.$2").toUpperCase());
        return name.replaceAll("^([A-Za-z])\\w+\\s([a-zA-Z])\\w+$","$1.$2").toUpperCase();
    }

    public static void main(String[] args) {
        abbrevName("P Favuzzi");
    }
}