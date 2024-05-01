package codewars;

public class FactDecomp {

        public static String decomp(int n) {

            double factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            System.out.println(factorial);
            int i=2;
            int count=0;
            do {
            while(factorial%i == 0) {
                factorial = factorial / i;
                count++;

            }
            if(count > 0) {
                System.out.print(i + "^" + count + " * ");
            }
            i++;
            count=0;
            }while (factorial>1);
            return "";
        }

    public static void main(String[] args) {
        System.out.println(decomp(22));
    }

    }

