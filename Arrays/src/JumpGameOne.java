public class JumpGameOne {
    public static void main(String[] args) {
        int arr[] = {2,3,1,1,4};
        System.out.println(jump(arr));
    }
    static boolean jump (int[] arr){
        int finalPosition = arr.length - 1;
        for(int i = arr.length - 2 ; i>=0 ; i--){
            if(i + arr[i]>=finalPosition){
                finalPosition = i;
            }
        }
        return finalPosition == 0;
    }
}
