public class SortZeroOneTwo {
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,0,0,1};
        sort(arr);
        for(int i : arr) System.out.println(arr[i]);
    }
    static void sort(int nums[]){
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        int temp;
        while(mid <= high){
            switch(nums[mid]){
                case 0:
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
            }
        }
    }

}
