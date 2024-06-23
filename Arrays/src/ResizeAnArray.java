import java.util.Arrays;

public class ResizeAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        Arrays.stream(arr).forEach(System.out::println);
        arr = resizeArray(arr, arr.length*2);
        System.out.println("After resizing array");
        System.out.println("Size of array:"+arr.length);
        Arrays.stream(arr).forEach(System.out::println);
    }
    static int[] resizeArray(int[] arr, int capacity){
        int[] temp = new int[capacity];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
        return temp;
    }
}
