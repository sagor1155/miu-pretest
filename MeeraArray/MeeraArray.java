public class MeeraArray {
    public static void main(String[] args) {
        System.out.println(isMeeraArr(new int[] {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6}));   // 1
        System.out.println(isMeeraArr(new int[] {2, 4, 6, 8, 6}));  // 0
        System.out.println(isMeeraArr(new int[] {2, 8, 7, 10, -4, 6})); // 0

    }

    public static int isMeeraArr(int[] a) {
        if (a.length == 0) return 0;

        boolean hasOdd = false;
        int startEvenCount = 0, endEvenCount = 0;

        for (int i=0; i<a.length; i++) {
            if (a[i]%2 == 0) {
                if (!hasOdd)
                    startEvenCount++;
                else
                    endEvenCount++;
            } else {
                hasOdd = true;
                endEvenCount = 0;
            }
        }

        return hasOdd && (startEvenCount==endEvenCount) ? 1 : 0;
    }
}