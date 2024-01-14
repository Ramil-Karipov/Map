public class Main {

    import java.util.List;
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.sort;

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 1) ;
            {
                System.out.println(num);
            }
        }
        Collections.sort(nums);
        nums.sort();
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) > nums.get(j)) {
                    int temp = nums.get(i);
                    nums.set(i, nums.get(j));
                    nums.set(j, temp);

                }
            }
            System.out.println(nums);
        }
        Set<Integer> set = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                set.add(num);
            }
            System.out.println(set);
        }
    }
}