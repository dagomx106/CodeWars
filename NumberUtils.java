package codewars;

import java.util.LinkedList;

public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        int aux = number;
        LinkedList<Integer> nList = new LinkedList<>();
        while(number > 0) {
            nList.push(number%10);
            number /= 10;
    }
           // System.out.println(nList);
        double res = 0;
        for (int i = 0; i < nList.size(); i++) {
            res += Math.pow(nList.get(i),nList.size());
        }
        //System.out.println(res);
        return res == aux;
    }

    public static void main(String[] args) {
        isNarcissistic(153);
    }
}
