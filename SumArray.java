package codewars;

public class SumArray {

        public static double sum(double[] numbers) {

            double res=0;
            if(numbers.length == 0) {
                return 0.0;
            } else {
               for (double e : numbers){
                   res += e;
               }
            }
            return res;
        }

    public static void main(String[] args) {
        double[] test = {2,9,3.4,-5};
        System.out.printf("Resultado: "+sum(test));

    }
}