public class MoveAllNegativeElements {
    public static void main(String[] args) {
        int arr[] = {2,-4,2,3,4,5,-1,-4,-6,2,1};
        int sortedArray[] = move(arr,arr.length);
        for(int i : sortedArray){
            System.out.println(i);
        }
    }
    static int[] move(int arr[],int n){
       int temp[] = new int[arr.length];
//       int temp = 0;
       int count = 0;
       for(int i = 0 ; i<arr.length; i++){
           if(arr[i]>0){
               temp[count]=arr[i];
               count++;
           }
       }
       for(int i = 0 ; i<arr.length; i++){
           if(arr[i]<0){
               temp[count]=arr[i];
               count++;
           }
       }
       return temp;
    }
}
