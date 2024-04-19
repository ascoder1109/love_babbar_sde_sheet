import java.util.Comparator;
import java.util.PriorityQueue;

public class KthMaximumAndMinumumElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        kthMinimum(arr,3);
        kthMaximum(arr,2);
    }
    static void kthMaximum(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = arr.length;
        for(int i = 0 ; i<k ; i++){
            pq.add(arr[i]);
        }
        for(int i = k ; i < n ; i++){
            if(pq.peek()<arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        System.out.println(pq.peek());

    }
    static void kthMinimum(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int n = arr.length;
        for(int i = 0 ; i<k ; i++){
            pq.add(arr[i]);
        }
        for(int i = k ; i < n ; i++){
            if(pq.peek()>arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        System.out.println(pq.peek());

    }

}
