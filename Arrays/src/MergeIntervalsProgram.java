import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalsProgram {
    public static void main(String[] args) {
        int arr[][] = {{1,3},{2,6},{8,9},{9,11},{8,10},{2,4}};
        int[][] mergedIntervals = merge(arr);
        for (int[] ints : mergedIntervals) {
            System.out.println(Arrays.toString(ints));
        }
    }
    static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);
        for(int[] interval : intervals) {
            if(interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
            else{
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
