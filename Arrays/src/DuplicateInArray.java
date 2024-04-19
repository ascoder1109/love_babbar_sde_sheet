import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicateInArray {
    public static void main(String[] args) {
        int arr[] = {2,2,3,4,5,6,7,8,9};
        System.out.println("Duplicate:"+duplicateInArray(arr));
    }
    static int duplicateInArray(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
//        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1){
                return entry.getKey();
            }
        }
        return 0;
    }
}
