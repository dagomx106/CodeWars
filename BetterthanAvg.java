package codewars;

import java.util.ArrayList;
import java.util.List;

public class BetterthanAvg{
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {

        List<Integer> aux = new ArrayList<>(classPoints.length+1);
        aux.add(yourPoints);
        for (int i = 0; i < classPoints.length; i++) {
            aux.add(classPoints[i]);
        }
        System.out.println(aux);
        int sum = 0;
        for(int i = 0; i < aux.size(); i++ )
        {
            sum = sum+aux.get(i);
        }
        double avg = (double) sum/ aux.size();
        System.out.println(avg);

        //return Arrays.stream(classPoints).average().orElse(0) < yourPoints;

        return avg < yourPoints;

    }

    public static void main(String[] args) {
        betterThanAverage(new int[]{2,3}, 5);
    }
}
