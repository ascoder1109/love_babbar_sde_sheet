public class FactorialOfANumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("The factorial of " + n + " is " + factorial(n));
    }
    static int factorial(int n) {
        int fact = 1;
        while(n>0){
            fact = fact * n;
            n--;
        }
        return fact;
    }
}

//1. Initialize a variable fact to 1. This variable will store the factorial value throughout the algorithm.
//2. Start a loop that continues as long as n is greater than 0. This ensures the loop iterates for all positive values of n until we reach 1 (factorial of 0 is 1).
//3. Inside the loop, multiply the current value of fact with the current value of n and store the result back into fact. This essentially calculates the product of consecutive positive integers from 1 up to n.
//4. Decrement n by 1. This prepares for the next iteration of the loop, where fact will be multiplied by the new value of n.
//5. After the loop terminates, the fact variable will hold the factorial of the original n.
//6. Return the value of fact.