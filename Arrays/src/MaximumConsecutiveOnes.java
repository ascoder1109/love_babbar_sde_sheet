public class MaximumConsecutiveOnes {
    public static void main(String[] args) {

    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0 ; i<nums.length; i++){
            if(nums[i]==1) count++;
            else{
                ans = Math.max(ans,count);
                count = 0;
            }
        }
        if(ans<count) return count;
        return ans;
    }
}
