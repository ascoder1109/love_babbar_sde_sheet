import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int arr[] = {1,0,6,-1};
        System.out.println(longestConsecutive(arr));
    }
    static int longestConsecutive(int[] nums){
        int longestLength = 0;
        Map<Integer, Boolean> exploredMap = new HashMap<>();
        for(int num : nums){
            exploredMap.put(num, false);
        }
        for(int num : nums){
            int currentLength = 1;
            int nextNum = num + 1;
            while (exploredMap.containsKey(nextNum) && exploredMap.get(nextNum) == false) {
                currentLength++;
                exploredMap.put(nextNum, true);
                nextNum++;
            }
            int prevNum = num - 1;
            while (exploredMap.containsKey(prevNum) && !exploredMap.get(prevNum)) {
                currentLength++;
                exploredMap.put(prevNum, true);
                prevNum--;
            }
            longestLength = Math.max(longestLength, currentLength);
        }
        return longestLength; 
    }
}
