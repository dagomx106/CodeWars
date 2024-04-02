package codewars;
public class TrafficLights {
    public static String updateLight(String current) {

        switch (current){
            case "red":
                System.out.println("green");
                return "green";
            case "yellow":
                System.out.println("red");
                return "red";
            case "green":
                System.out.println("yellow");
                return "yellow";
            default:
                System.out.println("invalid");
                return "invalid";
        }
    }

    public static void main(String[] args) {
        updateLight("red");
        updateLight("yellow");
        updateLight("green");
    }
}