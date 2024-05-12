public class SortColors {
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,2,2,1,0};
        sort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    static void sort(int arr[]){
        int n = arr.length;
        int i = 0 ; 
        int j  = 0;
        int k = n-1 ;
        while (j<=k) {
            if (arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else if(arr[j] == 1){
                j++;
            }
            else if (arr[j] == 2) {
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                k--;
                
            }

        }
    }

}
