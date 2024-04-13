import java.util.HashMap;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1,5,7,1};
        System.out.println(countPairsWithGivenSum(arr,arr.length,6));
    }
    static int countPairsWithGivenSum(int[] arr, int n , int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            int b = k - arr[i];
            if(map.containsKey(b)){
                ans += map.get(b);
            }
            map.put(b, map.getOrDefault(b, 0) + 1);
        }
        return ans;
    }
}
