public class MaximumAndMiimumElementInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        maxAndMin(arr);
    }
    static void maxAndMin(int arr[]){
        int n = arr.length;
        int min = arr[0];
        int max = arr[0];
        for(int i = 1 ; i<n ; i++){
            if(arr[i] > arr[max]) max = arr[i];
            if(arr[i] < arr[min]) min = arr[i];
        }
        System.out.println("Maximum: " + max + " Minimum: " + min);
    }
}
