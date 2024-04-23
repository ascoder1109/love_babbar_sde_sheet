import java.util.Arrays;

public class MergeTwoSortedArrayWithoutUsingExtraSpace {
    public static void main(String[] args) {

    }
    static void merge(int arr1[] , int arr2[], int n1, int n2) {
        int left  = n1-1;
        int right = 0;
        while(left>=0 && right<n2){
            if(arr1[left]>arr2[right]){
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
