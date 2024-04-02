package codewars;

import java.util.Arrays;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {

       var res =  Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
       return res.getMax() + " " + res.getMin();
    }

    public static void main(String[] args) {
        highAndLow("4 6 -2 0 3");
    }
}
