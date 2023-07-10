public class SuperArr {
    public static void main(String[] args) {
        System.out.println(isSuper(new int[]{2, 3, 6, 13}));
        System.out.println(isSuper(new int[]{2, 3, 5, 11}));
        System.out.println(isSuper(new int[]{2}));
    }

    public static int isSuper(int[] a) {
        if (a == null || a.length == 0) return 0;

        for (int i=1; i<a.length; i++) {
            int curr = a[i];
            int sum = 0;
            for (int k=0; k<i; k++) {
                sum += a[k];
            }
            if (sum >= curr) return 0;
        }

        return 1;
    }
}