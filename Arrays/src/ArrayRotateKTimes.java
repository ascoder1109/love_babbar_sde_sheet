public class ArrayRotateKTimes {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        rotate(arr,3);
        for(int i : arr) System.out.print(i+" ");
    }
    static void rotate(int[] arr, int k) {
        int n = arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

    }
    public static void reverse(int arr[],int start,int end){

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
