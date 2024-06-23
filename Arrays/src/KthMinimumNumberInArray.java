import java.util.Comparator;
import java.util.PriorityQueue;

public class KthMinimumNumberInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(kthMinimumNumber(arr,3));
    }
    static int kthMinimumNumber(int[] arr, int k){
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0; i < k ; i++){
            pq.add(arr[i]);
        }
        for(int i = k ; i < n ; i++ ){
            if (pq.peek()>arr[i]){
                pq.poll();
            pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}
