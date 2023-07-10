public class RapidIncrease {
    public static void main(String[] args) {
        System.out.println(isRapidlyIncreasing(new int[]{1,3,9,27}));
        System.out.println(isRapidlyIncreasing(new int[]{1,3,200,500}));
        System.out.println(isRapidlyIncreasing(new int[]{1}));
        System.out.println(isRapidlyIncreasing(new int[]{1,3,9,26}));
        System.out.println(isRapidlyIncreasing(new int[]{1,3,7,26}));
        System.out.println(isRapidlyIncreasing(new int[]{1,3,8,26}));
    }

    public static int isRapidlyIncreasing(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        for (int i=1; i<nums.length; i++) {
            int curr = nums[i];
            int sum = 0;
            for (int k=0; k<i; k++) {
                sum += nums[k];
            }
            if (sum*2 >= curr) return 0;
        }

        return 1;
    }
}