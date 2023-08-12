
public class ZeroPlentiful {
    public static void main(String[] args) {
        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));
        System.out.println(isZeroPlentiful(new int[]{0,0,0,0,0,1,0,0,0,0,8,0,0,0,0,0,0}));
        System.out.println(isZeroPlentiful(new int[]{1, 2, 3, 4}));
        System.out.println(isZeroPlentiful(new int[]{1, 0, 0, 0, 2, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{0}));
    }

    static int isZeroPlentiful(int[] a) {
        if (a.length < 4) return 0;
        int countSq = 0, zeroes = 0;
        for (int i=0; i<a.length; i++) {
            if (a[i] == 0) {
                zeroes++;
                if (i == a.length-1 && zeroes >= 4) {
                    countSq++;
                }
            } else {
                if (zeroes >= 4) {
                    countSq++;
                }
                zeroes = 0;
            }
        }
        return countSq;
    }
}