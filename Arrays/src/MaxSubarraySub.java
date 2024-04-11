public class MaxSubarraySub {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(maxSubarraySum(arr,arr.length));
    }
    static int maxSubarraySum(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            max = Math.max(max, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return sum;
    }
}
