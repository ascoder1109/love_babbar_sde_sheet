public class MoveZereosToTheEnd {
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        moveZeroes(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    static void moveZeroes(int arr[]){
        int snowBall = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if (arr[i]==0) {
                snowBall++;
            }
            else if (snowBall>0) {
                int temp = arr[i];
                arr[i] = arr[i-snowBall];
                arr[i-snowBall] = temp;
            }
        }
    }
}
