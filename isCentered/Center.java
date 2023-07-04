public class Center {
    public static void main (String[] args) {
        System.out.println(isCentered(new int[] {1,2,3,4,5}));  // 0
        System.out.println(isCentered(new int[] {3,2,1,4,5}));  // 1
        System.out.println(isCentered(new int[] {3,2,1,4,1}));  // 0
        System.out.println(isCentered(new int[] {1,2,3,4}));    // 0
        System.out.println(isCentered(new int[] {}));           // 0
        System.out.println(isCentered(new int[] {10}));         // 1
    }

    public static int isCentered(int[] nums) {
        if (nums.length%2==0) return 0;
        if (nums.length==1) return 1; // not necessary

        int midIndex = nums.length / 2;
        int midValue = nums[midIndex];

        for (int i=0; i<nums.length; i++) {
            if (midValue >= nums[i] && i!=midIndex) return 0;
        }
        return 1;
    }
}