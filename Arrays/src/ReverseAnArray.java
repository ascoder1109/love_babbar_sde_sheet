import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {2,11,5,10,7,8};
        reverseArray(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
    }
    static void reverseArray(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
