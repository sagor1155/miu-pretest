public class PairedN {
    public static void main(String[] args) {
        System.out.println(isPairedN(new int[]{1,4,1,4,5,6}, 5));
        System.out.println(isPairedN(new int[]{1,4,1,4,5,6}, 6));
        System.out.println(isPairedN(new int[]{0,1,2,3,4,5,6,7,8}, 6));
        System.out.println(isPairedN(new int[]{1,4,1}, 5));
        System.out.println(isPairedN(new int[]{8,8,8,8,7,7,7}, 15));
        System.out.println(isPairedN(new int[]{8,-8,8,8,7,7,-7}, -15));
        System.out.println(isPairedN(new int[]{3}, 3));
        System.out.println(isPairedN(new int[]{}, 0));
    }

    public static int isPairedN(int[] nums, int n) {
        return 0;
    }
}