import java.util.ArrayList;

public class RearrangePositiveAndNegative {
    public static void main(String[] args) {

    }
    static void rearrange(int arr[], int n) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            if(arr[i]<0) negative.add(arr[i]);
            else positive.add(arr[i]);
        }

        int i = 0;
        int positiveIndex = 0;
        int negativeIndex = 0;
        while(positiveIndex<positive.size() && negativeIndex < negative.size()){
            if(i%2==0){
                arr[i] = positive.get(positiveIndex);
                positiveIndex++;

            }
            else{
                arr[i] = negative.get(negativeIndex);
                negativeIndex++;
            }
            i++;
        }
        while(positiveIndex<positive.size()){
            arr[i] = positive.get(positiveIndex++);
            i++;
        }
        while(negativeIndex<negative.size()){
            arr[i] = negative.get(negativeIndex++);
            i++;
        }

    }
}
