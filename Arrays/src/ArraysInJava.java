import java.util.Arrays;

public class ArraysInJava {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Arrays.stream(arr).forEach(System.out::println);
    }
}
