package codewars;

public class GrassHopper {

    public static int summation(int n) {

        int sum =0;
        for (int i = n; i > 0; i--) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        summation(7);
        System.out.println(summation(7));
    }
}