public class ReverseTheArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        reverseArray(arr,arr.length);
        for(int element:arr){
            System.out.println(element);
        }
    }
    static void reverseArray(int arr[] , int n){
        for(int i = 0 ; i < n/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
}