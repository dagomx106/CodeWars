package codewars;

public class Isogram {
    public static boolean isIsogram(String str) {
        if(str == "") return true;
        int[] letters = str.toLowerCase().chars().sorted().toArray();
        boolean res = true;
        for (int i = 1; i < letters.length; i++) {
            if(letters[i-1] == letters[i]){
                res = false;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("bod"));
        System.out.println(isIsogram("moOse"));
        System.out.println(isIsogram("aba"));
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram(""));

    }
}