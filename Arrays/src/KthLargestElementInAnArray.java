import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        int arr[] = {1,5,4,6,2,3};
        System.out.println(kthLargestElement(arr, 2));
    }
    static int kthLargestElement(int arr[] , int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i  = 0 ; i< k  ; i++){
            pq.add(arr[i]);
        }
        for(int i = k ; i<arr.length ; i++){
            if (pq.peek()<arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();

    }
}
