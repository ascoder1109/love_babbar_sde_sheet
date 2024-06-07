public class FindSumOfNNumbers {
    public static void main(String[] args) {
        System.out.println(findSum(5));
    }
    public static int findSum(int n){
        return n * (n + 1) / 2;
    }
}
