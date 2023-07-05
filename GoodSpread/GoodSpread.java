public class GoodSpread {
    public static void main(String[] args) {
        System.out.println(isGoodSpread(new int[] {2, 1, 2, 5, 2, 1, 5, 9})); // 1
        System.out.println(isGoodSpread(new int[] {3, 1, 3 ,1, 3, 5, 5, 3})); // 0
    }

    public static int isGoodSpread(int[] a) {
        for (int i=0; i<a.length; i++) {
            int count = 0;
            for (int k=0; k<a.length; k++) {
                if (a[i] == a[k]) count++;
            }
            if (count > 3) return 0;
        }

        return 1 ;
    }
}