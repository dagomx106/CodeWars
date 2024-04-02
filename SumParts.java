package codewars;

class SumParts {
    public static int[] sumParts(int[] ls) {
        int[] result = new int[ls.length+1];
        for(int i = ls.length-1; i >= 0; --i) {
            result[i] = result[i+1] + ls[i];
        }

        for (int e : result){
            System.out.println(e);
        }

        return result;
    }

    public static void main(String[] args) {
        sumParts(new int[]{744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358});
    }
}