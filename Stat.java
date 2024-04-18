package codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stat {

    public static String stat(String strg) {
        if (strg == "" || strg.isBlank()) {
            return "";
        } else {
            List<Integer> stats = new ArrayList<Integer>();
            int Mean = 0;
            for (String time : strg.split(", ")) {
                int t = Integer.parseInt(time.substring(0, time.indexOf('|'))) * 60 * 60 +
                        Integer.parseInt(time.substring(time.indexOf('|') + 1, time.lastIndexOf('|'))) * 60 +
                        Integer.parseInt(time.substring(time.lastIndexOf('|') + 1));
                Mean += t;
                stats.add(t);
            }
            Collections.sort(stats);
            int Range = Collections.max(stats) - Collections.min(stats);
            Mean /= stats.size();
            int Median = stats.size() % 2 == 0 ? (stats.get((stats.size() / 2) - 1) + stats.get(stats.size() / 2)) / 2 : stats.get((stats.size() / 2));

            return String.format("Range: %02d|%02d|%02d Average: %02d|%02d|%02d Median: %02d|%02d|%02d",
                    Range / 3600, (Range % 3600) / 60, Range % 60, Mean / 3600, (Mean % 3600) / 60, Mean % 60, Median / 3600, (Median % 3600) / 60, Median % 60);
        }
    }


    public static void main(String[] args) {
        System.out.println(stat("01|15|59, 1|47|6, 01|17|20, 1|32|34, 2|3|17"));
    }

}