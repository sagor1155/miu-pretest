public class Bean {
    public static void main(String[] args) {
        System.out.println(isBean(new int[]{4,9,8}));       // 1
        System.out.println(isBean(new int[]{2,2,5,11,23})); // 1
        System.out.println(isBean(new int[]{7,7,3,6}));     // 1
        System.out.println(isBean(new int[]{0}));           // 1
        System.out.println(isBean(new int[]{3,8,4}));       // 0
    }

    public static int isBean(int[] a) {
        if (a.length==0) return 0;

        for (int i=0; i<a.length; i++) {
            int elem = a[i];
            boolean hasBean = false;
            for (int k=0; k<a.length; k++) {
                if (elem == a[k]*2 || elem == (a[k]*2+1) || elem == a[k]/2) {
                    hasBean = true;
                    break;
                }
            }
            if (!hasBean) return 0;
        }

        return 1;
    }
}