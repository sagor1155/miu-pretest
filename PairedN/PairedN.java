public class PairedN {
    public static void main(String[] args) {
        System.out.println(isPairedN(new int[]{1,4,1,4,5,6}, 5));   // 1
        System.out.println(isPairedN(new int[]{1,4,1,4,5,6}, 6));   // 1
        System.out.println(isPairedN(new int[]{0,1,2,3,4,5,6,7,8}, 6));   // 1
        System.out.println(isPairedN(new int[]{1,4,1}, 5));   // 0
        System.out.println(isPairedN(new int[]{8,8,8,8,7,7,7}, 15));   // 0
        System.out.println(isPairedN(new int[]{8,-8,8,8,7,7,-7}, -15));   // 0
        System.out.println(isPairedN(new int[]{3}, 3));   // 0
        System.out.println(isPairedN(new int[]{}, 0));   // 0
    }

    public static int isPairedN(int[] nums, int n) {
        if (nums.length<2 || n<0 || n>((nums.length-1)+(nums.length-2))) return 0;

        for (int i=0; i<nums.length; i++) {
            for (int k=0; k<nums.length; k++) {
                int sum = nums[i] + nums[k];
                if (i!=k && nums[i]!=nums[k] && sum==n && i+k==n) return 1;
            }
        }

        return 0;
    }
}