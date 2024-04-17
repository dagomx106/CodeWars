package codewars;

import java.util.HashMap;
import java.util.Map;

public class HexToRGB {

    public static Map<String, Integer> hexStringToRGB(String hex) {

        String lHex =  hex.toUpperCase();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("r",Integer.parseInt(lHex.substring(1,3),16));
        map.put("g",Integer.parseInt(lHex.substring(3,5),16));
        map.put("b",Integer.parseInt(lHex.substring(5,7),16));

        return map;
    }

    public static void main(String[] args) {
        System.out.println(hexStringToRGB("#FF15AA"));
    }

}