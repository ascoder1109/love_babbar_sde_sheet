public class JumpGameTwo {
    public static void main(String[] args) {

    }
    static int jump(int[] arr) {
        int totalJumps = 0;
        int destination = arr.length - 1;
        int coverage = 0, lastJumpIndex = 0;
        for(int i = 0; i < arr.length; i++) {
            coverage = Math.max(coverage, i + arr[i]);
            if(i==lastJumpIndex) {
                lastJumpIndex = coverage;
                totalJumps++;
                if(coverage >= lastJumpIndex) {
                    return totalJumps;
                }
            }

        }
        return totalJumps;
    }
}
