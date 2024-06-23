import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] arr) {
        int n = arr.length;
        int sumOfElements = Arrays.stream(arr).sum();
        int actualSum = IntStream.range(1,n+2).sum();
        return actualSum - sumOfElements;
    }
}
