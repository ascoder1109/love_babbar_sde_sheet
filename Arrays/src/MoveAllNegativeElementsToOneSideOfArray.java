public class MoveAllNegativeElementsToOneSideOfArray {
    public static void main(String[] args) {
        int arr[] = {2,3,-1,4,-5,6,7,-8};
        int temp[] = move(arr);
        for(int i : temp) System.out.println(i);
    }
    static int[] move(int[] arr){
        int temp[] = new int[arr.length];
        int n = arr.length;
        int index = 0;
        for(int i = 0 ; i<n ; i++){
            if(arr[i]>=0){
                temp[index] = arr[i];
                index++;
            }
        }
        for(int i = 0 ; i<n ; i++){
            if(arr[i]<0){
                temp[index] = arr[i];
                index++;
            }
        }

        return temp;
    }
}
