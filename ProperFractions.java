package codewars;

public class ProperFractions {
    public static long properFractions(long n) {

        long count = 0;
        for (int i = 1; i < n; i++) {
            if (!(i % 2 == 0 && n % 2 == 0)) {
                if (!(i % 3 == 0 && n % 3 == 0)) {
                    if (!(i % 7 == 0 && n % 7 == 0)) {
                        if (!(i % 5 == 0 && n % 5 == 0)) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(properFractions(15));
    }
}
