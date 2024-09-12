import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// class Student implements Comparable<Student> {
class Student {
    int age;
    String name;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age = " + age + ", name = " + name + "]";
    }

    // @Override
    // public int compareTo(Student that) {
    //     if(this.age > that.age) return 1;
    //     return -1;
    // }
}

public class Sorting {
    public static void main(String args[]) {
        // Comparator<Integer> com = new Comparator<Integer>() {
        //     public int compare(Integer i, Integer j) {
        //         if(i % 10 > j % 10) 
        //             return 1;
        //         else 
        //             return -1;
        //     }
        // };

        // List<Integer> nums = new ArrayList<>();

        // nums.add(10);
        // nums.add(65);
        // nums.add(29);
        // nums.add(76);

        // // Collections.sort(nums, com);
        // Collections.sort(nums, new Comparator<Integer>() {
        //     public int compare(Integer i, Integer j) {
        //         if(i % 10 > j % 10) {
        //             return 1;
        //         } else {
        //             return -1;
        //         }
        //     }
        // });

        // System.out.println(nums);

        List<String> strs = new ArrayList<String> ();
        strs.add("Elderberry");
        strs.add("Date");
        strs.add("Cherry");
        strs.add("Apple");
        strs.add("Fig"); 
        strs.add("Banana");
        
        Collections.sort(strs, new Comparator<String>() {
            public int compare(String str1, String str2) {
                if(str1.length() > str2.length()) return 1;
                return -1;
            }
        });

        // System.out.println(strs);

        List<Student> s = new ArrayList<Student>();
        s.add(new Student("John", 20));
        s.add(new Student("Frank", 20));
        s.add(new Student("Alice", 22));
        s.add(new Student("David", 22));
        s.add(new Student("Eve", 21));
        s.add(new Student("Charlie", 20));
        s.add(new Student("Bob", 21));

        // Collections.sort(s, new Comparator<Student>() {
        //     public int compare(Student i, Student j) {
        //         if(i.age > j.age) return 1;
        //         return -1;
        //     }
        // });
        
        // lambda functions can also be used
        Collections.sort(s, (s1, s2) -> s1.age > s2.age ? 1 : -1);

        for(Student st : s) {
            System.out.println(st);
        }
    }
}
