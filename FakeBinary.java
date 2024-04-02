package codewars;
public class FakeBinary {
    public static String fakeBin(String numberString) {

        StringBuilder sb = new StringBuilder();

    for(int i = 0; i < numberString.length(); i++)
       if(numberString.charAt(i) >= 53) {
           //System.out.println("mayor igual a 5");
           sb.append(1);
       }else {
           //System.out.println("menor");
           sb.append(0);
       }
    return sb.toString();
    //return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }

    public static void main(String[] args) {
        System.out.println(fakeBin("32326623"));
    }
}