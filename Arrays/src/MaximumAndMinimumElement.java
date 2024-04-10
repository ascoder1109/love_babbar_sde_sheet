public class MaximumAndMinimumElement {
    public static void main(String[] args) {
        int arr[] = {2,4,7,5,3,8,9};
        System.out.println("Maximum Element:"+maximumElement(arr,arr.length));
        System.out.println("Minimum Element:"+minimumElement(arr,arr.length));
    }
    static int maximumElement(int arr[], int n ){
        int max = Integer.MIN_VALUE;
        for(int element: arr){
            max = Math.max(max,element);
        }
        return max;
    }
    static int minimumElement(int arr[], int n){
        int min = Integer.MAX_VALUE;
        for(int element: arr){
            min = Math.min(min,element);
        }
        return min;
    }

}
