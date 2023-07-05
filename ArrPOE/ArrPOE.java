public class ArrPOE {
    public static void main(String[] args) {
        System.out.println(poeIndex(new int[]{1,8,3,7,10,2})); // 3
        System.out.println(poeIndex(new int[]{1,5,3,1,1,1,1,1,1})); // 2
        System.out.println(poeIndex(new int[]{2,1,1,1,2,1,7})); // 5
        System.out.println(poeIndex(new int[]{1,2,3})); // -1
        System.out.println(poeIndex(new int[]{3,4,5,10})); // -1
        System.out.println(poeIndex(new int[]{1,2,10,3,4})); // -1
    }

    public static int poeIndex(int[] nums) {
        if (nums.length < 3) return -1;

        for (int i=1; i<nums.length-1; i++) {
            int poe = i;

            // left sum
            int leftSum = 0;
            for (int k=0; k<poe; k++) {
                leftSum += nums[k];
            }

            // right sum
            int rightSum = 0;
            for (int k=poe+1; k<nums.length; k++) {
                rightSum += nums[k];
            }

            if (leftSum == rightSum) return poe;
        }

        return -1;
    }
}