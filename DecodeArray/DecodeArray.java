public class DecodeArray {
    public static void main(String[] args) {
        System.out.println(decodeArray(new int[] {2, -3, -2, 6, 9, 18}));
        System.out.println(decodeArray(new int[] {0, -3, 0, -4, 0}));
        System.out.println(decodeArray(new int[] {-1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[] {1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[] {111, 115, 118, 127, 125}));
        System.out.println(decodeArray(new int[] {1, 1}));
    }

    static int decodeArray(int[] a) {
        if (a.length < 2) return 0;
        int sign = 1;
        if (a[0] < 0) sign = -1;

        int number = 0;
        for (int i=1; i<a.length; i++) {
            int diff = Math.abs(a[i-1] - a[i]);
            number = number*10 + diff;
        }

        return number * sign;
    }
}
