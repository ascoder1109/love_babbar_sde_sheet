import java.util.HashMap;
import java.util.Map;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,5,6};
        System.out.println(findDuplicate(arr,arr.length));
    }
    static int findDuplicate(int[] arr, int n) {
        Map <Integer,Integer> map = new HashMap <>();
        for (int i : arr){
            int count = map.getOrDefault(i,0)+1;
            map.put(i,count);
            if(count == 2) return i;
        }
        return -1;
    }
}
