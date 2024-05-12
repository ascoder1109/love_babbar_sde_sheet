import java.util.Arrays;
import java.util.Collections;

public class NextPermutationProgram {
    public static void main(String[] args) {
        int arr[] =  {2, 1, 5, 4, 3, 0, 0};
        int nextPermuation[] = nextPermutation(arr);
        for(int i : nextPermuation){
            System.out.print(i + " ");
        }
    }
    static int[] nextPermutation(int arr[]){
        int n = arr.length;
        int breakPointIndex = -1;
        for(int i = n - 2; i>=0 ; i--){
            if (arr[i]<arr[i+1]) {
                breakPointIndex = i;
                break;
            }
        }
        if (breakPointIndex == -1) {
            reverse(arr,0,n-1);
            return arr;
        }
        else{
            for(int i = n - 1 ; i>breakPointIndex ; i--){
                if(arr[i]>arr[breakPointIndex]){
                    int temp = arr[i];
                    arr[i] = arr[breakPointIndex];
                    arr[breakPointIndex] = temp;
                    break;
                }
            }
            reverse(arr, breakPointIndex+1, n-1);
            // reverse(arr, 0, n-1);
            return arr;
        }

    }
    static void reverse(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
