import java.util.ArrayList;

public class CommonElementsInThreeSortedArray {

    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && A[i] == C[k]) {
                if(!temp.contains(A[i])) {
                    temp.add(A[i]);
                }
                i++;
                j++;
                k++;
            }
            else if (A[i] > B[j]) {
                j++;
            }
            else if (B[j] > C[k]){
                k++;
            }
            else{
                i++;
            }

        }
        return temp;
    }
}
