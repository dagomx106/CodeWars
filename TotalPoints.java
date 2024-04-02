package codewars;
public class TotalPoints {
    public static int points(String[] games) {

        int points = 0;
        for (String e : games){
            if (Integer.valueOf(e.charAt(0)) > Integer.valueOf(e.charAt(2))){
                points = points+3;
            } else if (Integer.valueOf(e.charAt(0)).equals(Integer.valueOf(e.charAt(2)))) {
                points = points +1;
            }
        }
        return points;
    }

    public static void main(String[] args) {
        points(new String[]
                {"0:1","0:2","0:3","0:4","1:2","1:3","1:4","2:3","2:4","3:4"});
        points(new String[]
                {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"});

    }
}