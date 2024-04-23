public class PrintNameNTimes {
    public static void main(String[] args) {
        printName(5);
    }
    static void printName(int n){
        if (n==1){
            System.out.println("I am recursive function");
        }
        else{
            System.out.println("I am recursive function");
            printName(n-1);
        }
    }
}
