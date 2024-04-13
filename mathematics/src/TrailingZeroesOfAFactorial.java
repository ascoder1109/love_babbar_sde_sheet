public class TrailingZeroesOfAFactorial {
    public static void main(String[] args) {
        int n = 54;
        System.out.println("Number of trailing zeroes: " + n);
    }
    static int trailingZeroes(int n) {
        int count = 0;
        for(int i = 5 ; i>=1 ; i*=5){
            count += n/ i;
        }
        return count;
    }
}

//The idea is to consider prime factors of a factorial n. A trailing zero is always produced by prime factors 2 and 5. Our task is done if we can count the number of 5s and 2s. Consider the following examples:

//n = 5: There is one 5 and 3 2s in prime factors of 5! (2 * 2 * 2 * 3 * 5). So a count of trailing 0s is 1.
//n = 11: There are two 5s and eight 2s in prime factors of 11! (28 * 34 * 52 * 7 * 11). So the count of trailing 0s is 2.

//We can easily observe that the number of 2s in prime factors is always more than or equal to the number of 5s. So if we count 5s in prime factors, we are done.

//1. Initialize a variable count to 0. This variable will store the total number of trailing zeros in the factorial of n.
//2. Start a loop that iterates from i = 5 down to i = 1 in increments of 5. This loop considers all possible powers of 5 that can contribute trailing zeros.
//3. Inside the loop:
//      Divide n by the current power of 5 (i) and add the quotient (integer division discards the remainder) to the count variable. This essentially counts how many multiples of the current power of 5 are present up to n. Since each multiple of a higher power of 5 also contributes a trailing zero, this effectively counts the trailing zeros contributed by the current power of 5.
//4. After the loop terminates, the count variable will hold the total number of trailing zeros in the factorial of n.
//5. Return the value of count.