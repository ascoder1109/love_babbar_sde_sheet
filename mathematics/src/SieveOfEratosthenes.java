public class SieveOfEratosthenes {
    public static void main(String[] args) {
        sieve(20);
    }
    static void sieve(int n){
        boolean prime[] = new boolean[n+1];
        for(int i=0 ; i<=n ; i++){
            prime[i] = true;
        }
        for(int p = 2 ; p*p<=n ; p++){
            if(prime[p]==true){
                for(int q = p * p ; q<=n ; q+=p){
                    prime[q] = false;
                }
            }
        }
        for(int i=2 ; i<=n ; i++){
            if(prime[i]==true){
                System.out.print(i+" ");
            }
        }
    }
}

//https://www.geeksforgeeks.org/sieve-of-eratosthenes/
