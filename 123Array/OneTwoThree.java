import java.util.Arrays;

public class OneTwoThree {
    public static void main(String[] args) {
        System.out.println(is123Arr(new int[]{1,2,3,3,2,1})); // 0
        System.out.println(is123Arr(new int[]{0,1,2,3,1,2,3})); // 0
        System.out.println(is123Arr(new int[]{1,2,3,1,2,3,1,2,3})); // 1
        System.out.println(is123Arr(new int[]{1,2,3,3,2,1,1,2,3})); // 0
        System.out.println(is123Arr(new int[]{1,2,3})); // 1
        System.out.println(is123Arr(new int[]{})); // 0
    }

    public static int is123Arr(int[] nums) {
        if (nums.length<3 || nums.length%3 != 0) return 0;

        for (int i=0; i<nums.length; i+=3) {
            // copy array
            int[] temp = new int[3];
            for (int k=0; k<3; k++) temp[k] = nums[i+k];
            System.out.println("temp: " + Arrays.toString(temp));

            // match
            int matchingNum = temp[0]*100 + temp[1]*10 + temp[2];
            System.out.println(matchingNum);
            if(matchingNum != 123) return 0;
        }

        return 1;
    }
}