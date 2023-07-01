public class OneTwoOne {
    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1,1,2,2,2,1,1}));         // 1
        System.out.println(is121Array(new int[]{1,1,3,3,3,1,1}));         // 0
        System.out.println(is121Array(new int[]{1,1,2,2,2,1}));           // 0
        System.out.println(is121Array(new int[]{2,2,1,1,2,2,1,1}));       // 0
        System.out.println(is121Array(new int[]{1,1,1,2,1,1,1}));         // 1
        System.out.println(is121Array(new int[]{1,1,1,0,1,1,1}));         // 0
        System.out.println(is121Array(new int[]{1,1,2,2,1,1,2,2,1,1}));   // 0
        System.out.println(is121Array(new int[]{1,2}));                   // 0
        System.out.println(is121Array(new int[]{}));                      // 0
    }

    public static int is121Array(int[] nums) {
        if (nums.length < 3) return 0;
        if (nums[0] != 1 || nums[nums.length-1] != 1) return 0;

        int counterOneBalance = 0;
        boolean isTwoFoundInMiddle = false;

        for (int i=0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 2) return 0;

            if (nums[i] == 1 && !isTwoFoundInMiddle) {
                counterOneBalance++;
            }

            if (nums[i] == 1 && isTwoFoundInMiddle) {
                counterOneBalance--;
            }

            if (nums[i] == 2 && !isTwoFoundInMiddle && counterOneBalance > 0) {
                isTwoFoundInMiddle = true;
            }
        }

        return counterOneBalance == 0 ? 1 : 0;
    }
}