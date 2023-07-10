public class SumIsPower {
    public static void main(String[] args) {
        System.out.println(sumIsPower(new int[] {8,8,8,8}));
        System.out.println(sumIsPower(new int[] {8,8,8}));
        System.out.println(sumIsPower(new int[] {1}));
        System.out.println(sumIsPower(new int[] {3,5,3,5}));
    }

    public static int sumIsPower(int[] nums) {
        if (nums == null || nums.length == 0 ) return 0;

        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
        }

        int powOfTwo = 1;
        while (powOfTwo < sum) {
            powOfTwo *= 2;
        }

        return sum == powOfTwo ? 1 : 0;
    }
}