public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 12321;
        if (isPalindrome(n)){
            System.out.println("Palindrome number");
        }
        else {
            System.out.println("Not a palindrome number");
        }
    }
    static boolean isPalindrome(int n) {
        int reverse  = 0;
        int temp = n;
        while(n!=0){
            int digit = n%10;
            reverse = (reverse * 10) + digit;
            n = n/10;
        }
        return reverse==temp;
    }
}

//1. Initialize a variable reverse to 0. This variable will be used to store the reversed number.
//2. Start a loop that continues as long as the original number n is greater than 0.
//3. Inside the loop:
//      * Extract the last digit of n using the modulo operator (%).
//      * Append the extracted digit to the reverse number by shifting reverse one position to the left (multiplying by 10) and adding the extracted digit.
//      * Remove the last digit from n using integer division (//).
//4. After the loop terminates, compare the original number (n) with the reversed number (reverse).
//5. If n is equal to reverse, then the number is a palindrome. Otherwise, it is not.