package test;
import java.util.*;
import java.util.Map.Entry;

/**
 * Created by xy on 2017/1/4.
 */
public class sortMapTest {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("a", 2);
        hm.put("b", 3);
        hm.put("c", 4);
        hm.put("d", 1);
        Set<Entry<String, Integer>> set = hm.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(
                set);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey());

        }

    }
}

