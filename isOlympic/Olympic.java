public class Olympic {
    public static void main(String[] args) {
        System.out.println(isOlympic(new int[]{3, 2, 1}));  // 1
        System.out.println(isOlympic(new int[]{2, 2, 1, 1}));   // 1
        System.out.println(isOlympic(new int[]{1, 1000, 100, 10000, 2}));   // 1
        System.out.println(isOlympic(new int[]{1, 99, 99, 1000, 100, 10000, 2}));   // 0
        System.out.println(isOlympic(new int[]{1, 2, 1, 3, 2}));    // 0
        System.out.println(isOlympic(new int[]{1, 2, -1, 2, 2}));   // 0
    }

    public static int isOlympic(int[] nums) {
        if (nums.length==0) return 0;
        if (nums.length==1) return 1;

        for (int i=0; i<nums.length; i++) {
            int val = nums[i];
            int sum = 0;
            for (int k=0; k<nums.length; k++) {
                if (i!=k && nums[k]<val) {
                    sum += nums[k];
                }
            }
            if (val < sum) return 0;
        }

        return 1;
    }
}