import com.sun.source.tree.BreakTree;

public class GCDAndLCM {
    public static void main(String[] args) {
        int a = 15, b= 20;
        System.out.println("LCM of " + a + " and " + b + " = " + lcm(a, b));
        System.out.println("GCD of " + a + " and " + b + " = " + gcd(a, b));
    }
    static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }

    static int lcm(int a, int b){
        int formula = a/gcd(a,b) * b;
        return formula;
    }

}

//Greatest Common Divisor (GCD) - gcd(a, b)
//
//1. Base Case: If b is equal to zero, return a. This is because the GCD of any number and zero is the number itself.
//2. Recursive Case: Otherwise, return the GCD of b and the remainder (a % b) of dividing a by b. This works because the GCD of two numbers remains the same if you remove the smaller number's multiples from the larger number. The remainder essentially represents the part of a that is not divisible by b.
//3. Least Common Multiple (LCM) - lcm(a, b)
//4. Calculate the GCD: First, find the GCD of a and b using the gcd function (already explained).
//LCM formula: The LCM of a and b can be calculated using the formula lcm = (a * b) / gcd(a, b). This is because the LCM is the least common multiple of all the factors present in both a and b. Dividing the product of a and b by their GCD essentially removes duplicate factors, resulting in the least common multiple.
