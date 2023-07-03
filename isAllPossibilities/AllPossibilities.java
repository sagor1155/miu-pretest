public class AllPossibilities {
    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[] {1,2,0,3})); // 1
        System.out.println(isAllPossibilities(new int[] {3,2,1,0})); // 1
        System.out.println(isAllPossibilities(new int[] {1,2,4,3})); // 0
        System.out.println(isAllPossibilities(new int[] {0,2,3}));   // 0
        System.out.println(isAllPossibilities(new int[] {0}));       // 1
        System.out.println(isAllPossibilities(new int[] {}));        // 0
    }

    public static int isAllPossibilities(int[] nums) {
        if (nums.length == 0) return 0;

        for (int i=0; i<nums.length; i++) {
            boolean included = false;
            for (int k=0; k<nums.length; k++) {
                if (i == nums[k]) {
                    included = true;
                    break;
                }
            }
            if (!included) return 0;
        }

        return 1;
    }
}
