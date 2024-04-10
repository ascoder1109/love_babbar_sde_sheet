import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {5,6,7,8,9,10};
        int[] arr3 = union(arr1, arr2);
        for(int i : arr3){
            System.out.println(i);
        }
    }
    static int[] union(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();
        for(int i : arr1) set.add(i);
        for(int i: arr2) set.add(i);
        int[] unionArray = new int[set.size()];
        int index = 0;
        for(int elememt : set){
            unionArray[index] = elememt;
            index++;
        }
        return unionArray;
    }
}
