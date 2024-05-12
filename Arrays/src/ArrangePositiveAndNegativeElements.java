import java.util.ArrayList;

public class ArrangePositiveAndNegativeElements {
    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};
        int rearrangedElements[] = rearrangeArray(arr);
        for(int i : rearrangedElements){
            System.out.print(i + " ");
        }
    }
    public static int[] rearrangeArray(int arr[]){
        // int n = arr.length;
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int i : arr){
            if (i<0) {
                negative.add(i);
            }
            else{
                positive.add(i);
            }
        }
        int i = 0;
        int positiveIndex = 0;
        int negativeIndex = 0;
        while (positiveIndex<positive.size() && negativeIndex<negative.size()) {
            if (i%2==0) {
                arr[i] = positive.get(positiveIndex);
                positiveIndex++;
            }
            else{
                arr[i]= negative.get(negativeIndex);
                negativeIndex++;
            }
            i++;
        }
        //Remaining elements
        while (positiveIndex < positive.size()) {
            arr[i] = positive.get(positiveIndex++);
            i++;
        }
        while (negativeIndex < negative.size()) {
            arr[i] = negative.get(negativeIndex++);
            i++;
        }
        return arr;
    }    
}
