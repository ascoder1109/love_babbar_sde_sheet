public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(linearSearch(arr, 3));
    }   
    static int linearSearch(int arr[], int element){
        int n = arr.length;
        for(int i = 0 ; i<n ; i++){
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    } 
}
