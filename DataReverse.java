package codewars;

import java.util.ArrayDeque;
import java.util.Arrays;

public class DataReverse {
    public static int[] DataReverse(int[] data) {

        Arrays.stream(data).forEach(System.out::print);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < data.length; i++) {
            stack.push(data[i]);
        }
        int[] res = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            res[i] = stack.pop();
        }
        System.out.println("");
        Arrays.stream(res).forEach(System.out::print);
        return res;

    }

    public static void main(String[] args) {
        DataReverse(new int[] {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0});
    }
}