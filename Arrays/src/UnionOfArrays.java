
import java.util.TreeSet;


public class UnionOfArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7};
        int arr2[] = {4,5,6,7,8,9,10};
        int unionOfArrays[] = union(arr1, arr2);
        for(int i : unionOfArrays){
            System.out.println(i);
        }
    }
    static int[] union(int[] arr1, int[] arr2) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        int[] unionArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            unionArray[index++] = num;
        }

        return unionArray;

    }
}
