public class Print1ToN {
    public static void main(String[] args) {
        print1ToN(1,5);
    }
    static void print1ToN(int n, int count) {
        if (count == 1){
            System.out.println(n);
        }
        else{
            System.out.println(n);
            print1ToN(n+1, count-1);
        }
    }
}
