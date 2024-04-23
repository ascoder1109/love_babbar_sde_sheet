public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        System.out.println(sum(5,0));
    }
    static int sum(int n, int currentSum){
        if(n == 0){
            return currentSum;
        }
        else{
            return sum(n-1,currentSum+n);
        }
    }
}
