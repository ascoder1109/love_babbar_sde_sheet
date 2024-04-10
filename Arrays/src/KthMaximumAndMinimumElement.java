import java.util.Collections;
import java.util.PriorityQueue;

public class KthMaximumAndMinimumElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int k = 3;
        System.out.println(k+"th largest element:"+kthMaximum(arr,arr.length,k));
        System.out.println(k+"th minimum element:"+kthMinimum(arr,arr.length,k));
    }
    static int kthMaximum(int arr[], int n, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i<k ; i++){
            pq.add(arr[i]);
        }
        for(int i = k ; i<arr.length ; i++){
            if(arr[i]>pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
    static int kthMinimum(int arr[], int n, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i<k ; i++){
            pq.add(arr[i]);
        }
        for(int i = k ; i<arr.length ; i++){
            if(arr[i]<pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}
