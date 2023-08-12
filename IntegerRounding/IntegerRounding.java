import java.util.Arrays;

public class IntegerRounding {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(doIntegerRounding(new int[]{1, 2, 3, 4, 5}, 2)));
        System.out.println(Arrays.toString(doIntegerRounding(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(doIntegerRounding(new int[]{1, 2, 3, 4, 5}, -3)));
        System.out.println(Arrays.toString(doIntegerRounding(new int[]{-1, -2, -3, -4, -5}, 3)));
        System.out.println(Arrays.toString(doIntegerRounding(new int[]{-18, 1, 2, 3, 4, 5}, 4)));
        System.out.println(Arrays.toString(doIntegerRounding(new int[]{1, 2, 3, 4, 5}, 5)));
        System.out.println(Arrays.toString(doIntegerRounding(new int[]{1, 2, 3, 4, 5}, 100)));
    }

    static int[] doIntegerRounding(int[] a, int n) {
        if (n <= 0) return a;
        int[] newArr = new int[a.length];
        int idx = 0;

        for (int i=0; i<a.length; i++, idx++) {
            if (a[i] < 0) {
                newArr[idx] = a[i];
            } else {
                int val = a[i] / n;
                int base = n * val;
                newArr[idx] = Math.abs(a[i]-base) < Math.abs(a[i]-base-n) ? base : base+n;
            }
        }
        return newArr;
    }
}