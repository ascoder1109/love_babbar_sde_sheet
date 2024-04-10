public class RotateArrayToRight {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5,6,7,8};
        rotate(arr,arr.length,3);
        for(int i : arr){
            System.out.println(i);
        }
    }
    static void rotate(int[] arr, int n , int k){
        k = k % n;
        int i , j;
        for(i = n - k, j = n - 1; i < j ; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(i = 0, j = n - k - 1; i<j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(i = 0 , j=n-1 ; i<j ; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
