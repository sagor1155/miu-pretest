import java.util.Arrays;
public class CommonElm {
    public static void main(String[] args) {
        printArr(commonElem(new int[]{1,2,3}, new int[]{2,3}));
        printArr(commonElem(new int[]{1,8,3,2}, new int[]{4,2,6,1}));
    }

    public static int[] commonElem(int[] first, int[] second) {
        return second;
    }

    public static void printArr(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("##########");
    }
}