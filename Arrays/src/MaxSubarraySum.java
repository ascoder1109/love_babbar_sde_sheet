public class MaxSubarraySum {
    public static void main(String[] args) {
        int arr[] = {1,2,-5,6,7,3,10};
        System.out.println(maxSubarraySum(arr));
    }
    static int maxSubarraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
           currentSum += nums[i];
           if (currentSum > maxSum){
               maxSum = currentSum;
           }
           if(currentSum<0){
               currentSum = 0;
           }
        }
        return maxSum;
    }
}
