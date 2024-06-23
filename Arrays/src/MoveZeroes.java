import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {8,1,0,2,1,0,3};
        moveZeroes(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }

    static void moveZeroes(int[] nums) {
        int j = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0 && nums[j] == 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            if (nums[j] != 0) {
                j++;
            }
        }
    }
}
