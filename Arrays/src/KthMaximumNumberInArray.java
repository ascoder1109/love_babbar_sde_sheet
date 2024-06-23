import java.util.Arrays;
import java.util.PriorityQueue;

public class KthMaximumNumberInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(kthMaximumNumber(arr,3));
    }
    static int kthMaximumNumber(int[] arr, int k){
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < k ; i++){
            pq.add(arr[i]);
        }
        for(int i = k ; i < n ; i++ ){
            if (pq.peek()<arr[i]){
                pq.poll();
            pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}
