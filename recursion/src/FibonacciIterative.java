public class FibonacciIterative {
    public static void main(String[] args) {
        fibonacci(5);
    }
    static void fibonacci(int n){
        int first = 0;
        int second = 1;
        int third = first + second;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        for(int i = 3; i<n ;i++){
            first = second;
            second = third;
            third = first + second;
            System.out.println(third);
        }

    }
}
