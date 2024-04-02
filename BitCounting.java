package codewars;

public class BitCounting {

    public static int countBits(int n){

        System.out.println(Integer.toBinaryString(n));
        char[] arr = Integer.toBinaryString(n).toCharArray();
        int unos = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == '1'){
                unos++;
            }
        }
        //Integer.bitCount(n);
        return unos;
    }

    public static void main(String[] args) {
        countBits(376);
    }

}