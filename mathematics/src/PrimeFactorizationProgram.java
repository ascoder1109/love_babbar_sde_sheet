import java.util.ArrayList;

public class PrimeFactorizationProgram {
    public static void main(String[] args) {
        ArrayList<Integer> al = primeFactorization(10);
        System.out.println(al);

    }
    static ArrayList<Integer> primeFactorization (int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        while(n%2==0){
            primes.add(2);
            n/=2;
        }
        for(int i=3; i<Math.sqrt(n); i+=2){
            while(n%i==0){
                primes.add(i);
                n/=i;
            }
        }
        if(n>2) primes.add(n);
        return primes;
    }
}
