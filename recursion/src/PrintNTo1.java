public class PrintNTo1 {
    public static void main(String[] args) {
        printNTo1(5);
    }
    static void printNTo1(int n) {
        if(n==1){
            System.out.println(n);
        }
        else{
            System.out.println(n);
            printNTo1(n-1);
        }
    }
}
