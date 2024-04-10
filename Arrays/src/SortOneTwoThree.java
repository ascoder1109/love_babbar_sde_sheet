public class SortOneTwoThree {
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,2,1,2,1,1,2,0,0,1,0,2,1};
        sort(arr,arr.length);
        for(int i : arr){
            System.out.println(i);
        }
    }
    static void sort(int arr[], int n){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        int temp;
        while(mid <= high) {
            switch (arr[mid]) {
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
//                low++;
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
//                    mid++;
                    high--;
                    break;
            }
        }
    }
}
