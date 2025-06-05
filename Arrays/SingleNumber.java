import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, 5, 3, 4};
        int once = findSingleNumber(nums);
        System.out.println("The number that appears once is: " + once);
    }

    public static int findSingleNumber(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        for (int key : counts.keySet()) {
            if (counts.get(key) == 1) {
                return key;
            }
        }
        throw new RuntimeException("No unique element found");
    }
}