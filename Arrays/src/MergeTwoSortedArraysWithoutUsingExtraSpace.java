public class MergeTwoSortedArraysWithoutUsingExtraSpace {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 8, 10};
        int[] arr2 = {2, 3, 9};
        int n = 4, m = 3;
        merge(arr1, arr2, n, m);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
    public static void merge(int[] arr1, int[] arr2, int n, int m) {

        // len of the imaginary single array:
        int len = n + m;

        // Initial gap:
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            // Place 2 pointers:
            int left = 0;
            int right = left + gap;
            while (right < len) {
                // case 1: left in arr1[]
                //and right in arr2[]:
                if (left < n && right >= n) {
                    ifGreaterSwap(arr1, arr2, left, right - n);
                }
                // case 2: both pointers in arr2[]:
                else if (left >= n) {
                    ifGreaterSwap(arr2, arr2, left - n, right - n);
                }
                // case 3: both pointers in arr1[]:
                else {
                    ifGreaterSwap(arr1, arr1, left, right);
                }
                left++; right++;
            }
            // break if iteration gap=1 is completed:
            if (gap == 1) break;

            // Otherwise, calculate new gap:
            gap = (gap / 2) + (gap % 2);
        }
    }
    static void ifGreaterSwap(int arr1[], int arr2[], int ind1, int ind2){
        if(arr1[ind1]>arr2[ind2]){
            int temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }
}

//1. Define Gap and Length:
//
//Calculate the total length (len) by adding the sizes (n and m) of both arrays.
//Initialize a gap variable with half of the total length (len) rounded up ((len / 2) + (len % 2)). This gap size helps identify elements to be compared during merging.
//2. Loop with Shrinking Gap:
//
//The main loop iterates as long as the gap is greater than 0. This loop ensures multiple passes for merging elements with increasing distances.
//3. Initialize Pointers:
//
//Inside the loop, two pointers left and right are initialized.
//left starts at the beginning of the combined array (index 0).
//right starts gap elements away from left.
//4. Iterate and Compare:
//
//Another loop iterates while right is within the bounds of the combined array length (len).
//
//Inside this loop, three cases are considered based on the positions of left and right:
//
//Case 1: Left in arr1 and Right in arr2:
//
//This case compares elements from the two separate arrays.
//The swapIfGreater function is called to swap elements if the element in arr1 (left index) is greater than the element in arr2 (right - n index, considering the offset for arr2).
//Case 2: Both Pointers in arr2:
//
//This case compares elements within the second array.
//The swapIfGreater function is called to swap elements in arr2 if necessary (considering the offset for elements within arr2).
//Case 3: Both Pointers in arr1:
//
//This case compares elements within the first array.
//The swapIfGreater function is called to swap elements in arr1 if necessary.
//5. Update Pointers and Gap:
//
//After each comparison, both left and right pointers are incremented by 1 to move to the next elements in the combined array.
//6. Break or Recalculate Gap:
//
//The outer loop continues iterating as long as gap is greater than 0.
//Once all elements within the gap distance are compared, the loop might need to repeat with a smaller gap for further merging.
//If gap reaches 1, it signifies the comparison of adjacent elements, and the loop breaks as further reduction wouldn't be necessary.
//Otherwise, the gap is recalculated by dividing it by 2 and rounding up ((gap / 2) + (gap % 2)) for the next iteration.
//7. Sorted Array:
//
//After the loop completes, the elements in both arr1 and arr2 are rearranged in a sorted manner.
