public class CheckIfArrayIsSortedOrRotated {
    public static void main(String[] args) {
        // int arr[] = {2,1,3,4};
        int arr[] = {3,4,5,1,2};
        System.out.println(checkIfArrayIsSortedOrRotated(arr));
    }
    static boolean checkIfArrayIsSortedOrRotated(int arr[]){
        int n = arr.length;
        int count = 0 ;
        for(int i = 0 ; i<n; i++){
            if (arr[i]>arr[(i+1)%n]) {
                count++;
            }
        }
        return (count>1) ? (false) : (true);
    }
}
