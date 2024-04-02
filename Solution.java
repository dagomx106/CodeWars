package codewars;

class Solution {
    public static String camelCase(String input) {

        System.out.println(input.replaceAll("([A-Z])", " $1"));
        return input.replaceAll("([A-Z])", " $1");

    }

    public static void main(String[] args) {
        camelCase("dddDerCar");
    }
}
