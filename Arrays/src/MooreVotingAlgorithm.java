public class MooreVotingAlgorithm {
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));        
    }
    static int majorityElement(int arr[]){
        int n = arr.length;
        int candidate = 0;
        int count = 0;
        for(int i = 0 ; i<n ; i++){
            if (count == 0) {
                candidate = arr[i];
                count++;
            }
            else if (candidate == arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int anotherCount = 0;
        for(int i = 0 ; i < n ; i++){
            if (arr[i] == candidate) {
                anotherCount++;
            }
        }
        if (anotherCount>(n/2)) {
            return candidate;
        }
        return -1;
    }
}
