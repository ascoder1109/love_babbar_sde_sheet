import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int arr[] = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int arr[]){
        int n = arr.length;
        int actualSum = Arrays.stream(arr).sum();
        int sumOfAllElementsFrom1ToN = (n * (n + 1)) / 2;
        return sumOfAllElementsFrom1ToN - actualSum;
    }
}
