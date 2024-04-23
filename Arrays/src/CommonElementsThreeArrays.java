import java.util.ArrayList;

public class CommonElementsThreeArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {4,5,6,7,8,9,10};
        int arr3[] = {6,7,8,9};
        ArrayList<Integer> common = commonElements(arr1,arr2,arr3);
        System.out.println(common);
    }
    static ArrayList<Integer> commonElements(int[] arr1, int[] arr2, int[] arr3 ) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0 , k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if(arr1[i] == arr2[j] && arr2[j]==arr3[k]){
                if(!res.contains(arr1[i])) {
                    res.add(arr1[i]);
                    i++;
                    j++;
                    k++;
                }

            }
            else if (arr1[i]>arr2[j]){
                j++;
            }
            else if(arr2[j]>arr3[k]){
                k++;
            }
            else{
                i++;
            }
        }
        return res;
    }
}
