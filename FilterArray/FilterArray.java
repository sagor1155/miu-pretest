
public class FilterArray {
    public static void main(String[] args) {

        System.out.println(isFilter(new int[] {1, 2, 3, 9, 6, 11}));    // 1
        System.out.println(isFilter(new int[] {3, 4, 6, 7, 14, 16}));   // 1
        System.out.println(isFilter(new int[] {1, 2, 3, 4, 10, 11, 13}));   // 1
        System.out.println(isFilter(new int[] {3, 6, 5, 5, 13, 6, 13}));   // 1
        System.out.println(isFilter(new int[] {9, 6, 18}));   // 0
        System.out.println(isFilter(new int[] {4, 7, 13}));   // 0
    }

    static int isFilter(int[] a) {
        boolean isNine = false;
        boolean isEleven = false;
        boolean isSeven = false;
        boolean isThirteen = false;

        for (int i=0; i<a.length; i++) {
            if (a[i] == 9) isNine = true;
            if (a[i] == 11) isEleven = true;
            if (a[i] == 7) isSeven = true;
            if (a[i] == 13) isThirteen = true;
        }

        return ((isNine && !isEleven) || (isSeven && isThirteen)) ? 0 : 1;
    }
}