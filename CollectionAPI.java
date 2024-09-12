import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionAPI {
    public static void main(String args[]) {
        // List<Integer> nums = new ArrayList<Integer>();
        // Set<Integer> nums = new TreeSet<Integer>();
        // nums.add(6);
        // nums.add(5);
        // nums.add(8);
        // nums.add(2);
        // nums.add(6);
        // nums.add(123);

        // Iterator<Integer> values = nums.iterator();

        // while(values.hasNext()) 
        //     System.out.println(values.next());

        // using index value
        // System.out.println(nums.get(2));
        // System.out.println(nums.indexOf(5));
        // first value
        // System.out.println(nums.indexOf(6));

        // System.out.println(nums);
        // for(int n : nums) {
        //     System.out.println(n);
        // }

        // Map<String, Integer> students = new HashMap<String, Integer>();

        // students.put("Akshay", 21);
        // students.put("Shaily", 30);
        // students.put("Dev", 24);
        // students.put("Choocha", 22);

        // System.out.println(students);
        // System.out.println(students.get("Akshay"));

        // students.put("Akshay", 65);
        // System.out.println(students.get("Akshay"));

        // System.out.println(students.keySet());
        // for(String key : students.keySet()) {
        //     System.out.println(key + " : " + students.get(key));
        // }

        SortedMap<String, Integer> students = new TreeMap<>();
        students.put("Akshay", 90);
        students.put("Vidushi", 87);
        students.put("Kanishk", 75);
        students.put("Thakur", 78);

        for(String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}
