public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        reverse(arr);
        for(int i : arr) System.out.println(i);
    }
    public static void reverse(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i<n/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
    }
}