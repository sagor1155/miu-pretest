public class Meera {
    public static void main(String[] args) {
        System.out.println(isMeera(new int[]{7,9,0,10,1}));         // 1
        System.out.println(isMeera(new int[]{6,10,8}));             // 0
        System.out.println(isMeera(new int[]{7,6,1}));              // 0
        System.out.println(isMeera(new int[]{9,10,0}));             // 0
        System.out.println(isMeera(new int[]{1,1,0,8,0,9,9,1}));    // 1
    }

    static int isMeera(int[] a) {
        if (a.length < 2) return 0;

        boolean containsOne = false;
        boolean containsNine = false;

        for (int i=0; i<a.length; i++) {
            if (a[i]==1) containsOne = true;
            if (a[i]==9) containsNine = true;
            if (containsOne && containsNine) return 1;
        }
        return 0;
    }
}