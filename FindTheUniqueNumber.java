package codewars;

import java.util.Arrays;

// Make sure your class is public
public class FindTheUniqueNumber {
    public static double findUniq(double arr[]) {
        // Do the magic

        Arrays.sort(arr);
        return arr[0] != arr[1] ? arr[0] : arr[arr.length-1];
    }

    public static void main(String[] args) {
        findUniq(new double[]{0, 1, 0});
    }
}