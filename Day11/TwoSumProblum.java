import java.util.HashMap;

public class TwoSumProblum {
    public static void main(String args[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] nums = { 3, 2, 4 };
        int target = 6;
        for (int i = 0; i < nums.length; i++) {
            int number = target - nums[i];
            if (map.containsKey(number)) {
                System.out.print(map.get(number) + " " + i);
            }
            map.put(nums[i], i);
        }
    }
}
