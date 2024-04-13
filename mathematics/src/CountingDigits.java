//This program is used to count digits by dividing the digits by 10 so that every counted digits are removed

public class CountingDigits {
    public static void main(String[] args) {
        int n = 123456;
        System.out.println("Number of digits are :" + countDigits(n));
    }
    static int countDigits(int n){
        int count = 0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
}

//Algorithm:
//1. Initialize a counter variable count to 0. This variable will keep track of the number of digits encountered.
//2. Start a loop that continues as long as n is not equal to zero. This means the loop will continue iterating until all digits of the number have been processed.
//3. Inside the loop, increment the count variable by 1. This signifies that one digit has been counted.
//4. Divide n by 10 (integer division). This essentially removes the last digit from n. For instance, if n is 123, dividing by 10 gives you 12 (100s digit is removed).
//5. After the loop terminates, the count variable will hold the total number of digits in the original n.
//6. Return the value of count.