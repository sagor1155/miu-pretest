public class BunkerArray {
    public static void main(String[] args) {
        System.out.println(isBunker(new int[] {7, 6, 10, 1}));      // 1
        System.out.println(isBunker(new int[] {7, 6, 10}));         // 0
        System.out.println(isBunker(new int[] {6, 10, 1}));         // 0
        System.out.println(isBunker(new int[] {3, 7, 1, 8, 1}));    // 1
    }

    public static int isBunker(int[] a) {
        if (a.length < 2) return 0;

        boolean containsOne = false;
        boolean foundPrime = false;

        for (int i=0; i<a.length; i++) {
            if (a[i] == 1) containsOne = true;
            if (isPrime(a[i])) foundPrime = true;
            if (containsOne && foundPrime) return 1;
        }

        return 0;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i=2; i<=n/2; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
}