import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        int arr[] = {2,1,5,4,3,0,0};
        int arr2[] = nextPermutation(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr2[i] + " ");
        };
    }
    static int[] nextPermutation(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) list.add(i);

        int n = list.size();
        int chosenIndex = -1;

        // Find the largest index k such that arr[k] < arr[k + 1]
        for (int i = n - 2; i >= 0; i--) {
            if (list.get(i) < list.get(i + 1)) {
                chosenIndex = i;
                break;
            }
        }

        if (chosenIndex == -1) {
            // If no such index is found, reverse the whole list
            Collections.reverse(list);
        } else {
            // Find the largest index l greater than k such that arr[k] < arr[l]
            int nextIndex = -1;
            for (int i = n - 1; i > chosenIndex; i--) {
                if (list.get(i) > list.get(chosenIndex)) {
                    nextIndex = i;
                    break;
                }
            }

            // Swap elements at chosenIndex and nextIndex
            Collections.swap(list, chosenIndex, nextIndex);

            // Reverse the sequence from chosenIndex + 1 to end
            List<Integer> subList = list.subList(chosenIndex + 1, n);
            Collections.reverse(subList);
        }

        // Copy the list back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
