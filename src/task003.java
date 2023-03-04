import java.util.Arrays;

public class task003 {
    public static void main(String[] args) {
        int val = 3;
        int[] nums = new int[]{3, 2, 2, 3, 4, 1, 3};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = val;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
