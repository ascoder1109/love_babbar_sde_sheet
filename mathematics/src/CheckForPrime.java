public class CheckForPrime {
    public static void main(String[] args) {
        int n = 8;
        if(isPrime(n)){
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not Prime number");
        }
    }
    static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        if(n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i = 5; i<Math.sqrt(n) ;i++){
            if(n%i==0 || n%(i+6)==0){
                return false;
            }
        }
        return true;
    }
}
