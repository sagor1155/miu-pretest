public class SumEvenOdd {
    public static void main (String[] args) {
        System.out.println(f(new int[]{1}));
        System.out.println(f(new int[]{1,2}));
        System.out.println(f(new int[]{1,2,3}));
        System.out.println(f(new int[]{1,2,3,4}));
        System.out.println(f(new int[]{3,3,4,4}));
        System.out.println(f(new int[]{}));
    }

    public static int f(int[] a) {
        return 0;
    }
}