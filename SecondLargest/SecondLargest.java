public class SecondLargest {

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{1, 2, 3, 4}));
        System.out.println(secondLargest(new int[]{4, 1, 2, 3}));
        System.out.println(secondLargest(new int[]{1, 1, 2, 2}));
        System.out.println(secondLargest(new int[]{1, 1}));
        System.out.println(secondLargest(new int[]{1}));
        System.out.println(secondLargest(new int[]{}));
    }

    static int secondLargest(int[] a) {
        int max = -1;
        int secondMax = -1;

        for (int i=0; i<a.length; i++) {
            if (a[i] < 0) return -1;

            if (a[i] > max) {
                secondMax = max;
                max = a[i];
            } else if (a[i] > secondMax && a[i] < max) {
                secondMax = a[i];
            }
        }

        return secondMax;
    }
}