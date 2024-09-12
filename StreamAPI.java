import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList(1,6,3,56,83,2,7);

        // int sum = 0;
        // for(int n : nums) {
        //     if(n % 2 == 0) {
        //         n *= 2;
        //         sum += n;
        //     }
        // }

        // System.out.println(nums);
        // System.out.println(sum);

        // ForEach method of LIST
        // Consumer<Integer> con = new Consumer<Integer> () {
        //     public void accept(Integer num) {
        //         System.out.println(num);
        //     }
        // };
        // Consumer<Integer> con = num -> System.out.println(num);
        // nums.forEach(con);

        // nums.forEach(num -> System.out.println(num));

        // Stream<Integer> nums1 = nums.stream();
        // nums1.forEach(n -> System.out.println(n));
        // nums1.forEach(n -> System.out.println(n));

        // Stream<Integer> nums2 = nums1.filter(n -> n % 2 == 0);
        // Stream<Integer> nums3 = nums2.map(n -> n * 2);
        // Integer result = nums3.reduce(0, (c, e) -> c + e);
        // Integer result = nums.stream()
        //     .filter(n -> n % 2 == 0)
        //     .map(n -> n * 2)
        //     .reduce(0, (c, e) -> c + e);

        // System.out.println(result);

        // nums3.forEach(n -> System.out.println(n));

        // Predicate<Integer> p = new Predicate<Integer>() {
        //     public boolean test(Integer n) {
        //         return n % 2 == 0;
        //     }
        // };
        Predicate<Integer> p = n -> n % 2 == 0;

        // Function<Integer, Integer> f = new Function<Integer,Integer>() {
        //     public Integer apply(Integer n) {
        //         return n * 2;
        //     }
        // };
        Function<Integer, Integer> f = (Integer n) -> n * 2;

        // Integer result = nums.stream()
        //     .filter(p)
        //     .map(f)
        //     .reduce(0, (c, e) -> c + e);

        // System.out.println(result);

        // Stream<Integer> sortedValues = nums.stream().filter(p)
        //                         .map(f).sorted();

        // sortedValues.forEach(n -> System.out.println(n));

        Stream<Integer> sortedValues = nums.parallelStream().filter(p)
                                .map(f).sorted();

        sortedValues.forEach(n -> System.out.println(n));
    }
}
