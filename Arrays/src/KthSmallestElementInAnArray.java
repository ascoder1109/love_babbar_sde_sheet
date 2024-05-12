import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElementInAnArray {
    public static void main(String[] args) {
        int arr[] = {1,5,4,6,2,3};
        System.out.println(kthSmallestElement(arr, 4));
    }
    static int kthSmallestElement(int arr[] , int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i  = 0 ; i< k  ; i++){
            pq.add(arr[i]);
        }
        for(int i = k ; i<arr.length ; i++){
            if (pq.peek()>arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();

    }
}
