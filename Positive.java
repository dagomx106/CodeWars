package codewars;

import java.util.Arrays;

public class Positive{

    public static int sum(int[] arr){

        System.out.println(Arrays.stream(arr).filter(s -> s>=0).sum());
        return Arrays.stream(arr).filter(s -> s>=0).sum();

    }

    public static void main(String[] args) {
        sum(new int[]{3,-4,5,-3,4});
    }
}
