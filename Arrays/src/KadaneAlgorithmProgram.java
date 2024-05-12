public class KadaneAlgorithmProgram {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubarraySum(arr));
    }
    static int maxSubarraySum(int arr[]){
        int n = arr.length;
        int sum = 0 ;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<n ; i++){
            sum+=arr[i];
            max=Math.max(sum, max);
            if (sum<0) {
                sum=0;
            }
        }
        return max;
    }
}
