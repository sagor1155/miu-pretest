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
        int sumOdd = 0;
        int sumEven = 0;

        for (int i=0; i<a.length; i++) {
            if (a[i] % 2 == 0) {
                sumEven += a[i];
            } else {
                sumOdd += a[i];
            }
        }

        return sumOdd - sumEven;
    }
}