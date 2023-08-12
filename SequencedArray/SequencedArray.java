
public class SequencedArray {

    public static void main(String[] args) {
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1, 3, 4, 2, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}, -5, -2));
        System.out.println(isSequencedArray(new int[]{0, 1, 2, 3, 4, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1, 2, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{5, 4, 3, 2, 1}, 1, 5));
    }

    private static int isSequencedArray(int[] a, int m, int n) {

        // remove duplicates
        int[] temp = new int[a.length];
        temp[0] = a[0];
        int len = 1;
        for (int i=1; i<a.length; i++) {
            if (a[i] != a[i-1]) {
                temp[len++] = a[i];
            }
        }

        // remove zeroes
        int[] distElem = new int[len];
        for (int i=0; i<len; i++) {
            distElem[i] = temp[i];
        }

        // check sequence
        int sq = m;
        for (int i=0; i<distElem.length; i++) {
            if (distElem[i] != sq) return 0;
            sq++;
        }

        return (sq == n+1) ? 1 : 0;
    }
}