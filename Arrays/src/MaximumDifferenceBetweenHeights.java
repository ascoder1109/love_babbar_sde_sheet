import java.util.Arrays;

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int max = 0;
        int min = 0;
        int result = arr[n-1] - arr[0];
        for(int i = 1 ; i < n ; i++){
            if(arr[i]>=k){
                max = Math.max(arr[i-1]+k,arr[n-1]-k);
                min = Math.min(arr[i]-k , arr[0]+k);
                result = Math.min(result,max-min);
            }
            else{
                continue;
            }
        }
        return result;
    }
}