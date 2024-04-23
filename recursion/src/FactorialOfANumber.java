public class FactorialOfANumber {
    public static void main(String[] args) {
        System.out.println(factorial(6,1));
    }
    static int factorial(int n, int fact){
        if(n == 1){
            return fact;
        }
        else{
            return factorial(n-1, fact*n);
        }
    }
}
