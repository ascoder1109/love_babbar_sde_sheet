import java.util.Arrays;

public class RemoveEvenIntegers {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] result = removeEvenIntegers(arr);
        Arrays.stream(result).forEach(System.out::println);
    }
    static int[] removeEvenIntegers(int[] arr) {
        int oddCount = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % 2 == 0){
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int index = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % 2 != 0){
                result[index++] = arr[i];
            }
        }
        return result;
    }
}
