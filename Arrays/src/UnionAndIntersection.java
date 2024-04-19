import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[]= {1,2,3,4,5,6,7};
        int arr2[]={5,6,7,8,9,10,11};
        int union[] = union(arr1,arr2);
        System.out.println("Union:");
        for(int i : union) System.out.println(i);
        System.out.println("Intersection:");
        int intersection[] = intersection(arr1,arr2);
        for(int i : intersection) System.out.println(i);
    }
    static int[] union(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
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
    static int[] intersection(int[] arr1, int[] arr2) {
        int min = Math.min(arr1.length, arr2.length);
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<min;i++){
            set.add(arr1[i]);
        }
        for(int i = 0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                list.add(arr2[i]);
            }
        }
        int temp[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            temp[i] = list.get(i);
        }
        return temp;
    }
}
