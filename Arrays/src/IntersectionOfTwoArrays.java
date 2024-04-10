import java.util.ArrayList;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {5,6,7,8,9,10};
        int[] arr3 = intersection(arr1,arr2,arr1.length,arr2.length);
        for(int i : arr3){
            System.out.println(i);
        }
    }
    static int[] intersection(int[] arr1, int[] arr2, int m, int n){
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0, j= 0;
        while(i< arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                temp.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i]<arr2[j]) {
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
        }
        int[] anotherTemp = new int[temp.size()];
        for(int k = 0 ; k< temp.size();k++){
            anotherTemp[k] = temp.get(k);
        }
        return anotherTemp;
    }
}
