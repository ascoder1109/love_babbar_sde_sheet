public class SingleNumber {
    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
    static int singleNumber(int arr[]){
        int n = arr.length;
        int xorOfAllNumbers = 0;
        for(int i = 0 ; i<n ; i++){
            xorOfAllNumbers = arr[i] ^ xorOfAllNumbers;
        }
        return xorOfAllNumbers;
    }
}
