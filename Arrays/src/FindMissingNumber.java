import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {

    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSumConsecutive = (n * (n+1)) / 2;
        int actualSum = Arrays.stream(nums).sum();
        return totalSumConsecutive - actualSum;
    }
}
