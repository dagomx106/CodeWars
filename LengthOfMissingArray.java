package codewars;

import java.util.Arrays;

public class LengthOfMissingArray
{
    public static int getLengthOfMissingArray(Object[][] arrayOfArrays){

        if(arrayOfArrays == null || arrayOfArrays.length == 0){
            return 0;
        }

        int[] ord = new int[arrayOfArrays.length];

            for (int j = 0; j < arrayOfArrays.length; j++) {
                if(arrayOfArrays[j] == null || arrayOfArrays[j].length == 0){
                    return 0;
                }else {
                ord[j] = arrayOfArrays[j].length;
                System.out.print(arrayOfArrays[j].length);
            }}
            Arrays.sort(ord);
        for (int i = 0; i < ord.length; i++) {
            if(ord[i]+1 != ord[i+1]){
                System.out.println(ord[i]+1);
            return ord[i]+1 ;
        }}
        return 0;
    }

    public static void main(String[] args) {
        getLengthOfMissingArray(new Object[][] { new Object[] { 5, 2, 9 }, new Object[] { 4, 5, 1, 1 }, new Object[] { 1 }, new Object[] { 5, 6, 7, 8, 9 }} );
    }
}
