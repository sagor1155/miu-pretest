public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(nextPerfectSquare(6));
        System.out.println(nextPerfectSquare(36));
        System.out.println(nextPerfectSquare(0));
        System.out.println(nextPerfectSquare(-5));
    }

    public static int nextPerfectSquare(int n) {
        if (n==0) return 1;
        boolean isSquare = false;
        while (!isSquare) {
            n++;
            for (int i=0; i<=n/2; i++) {
                if (i*i == n) {
                    isSquare = true;
                    break;
                }
            }
        }
        return n;
    }
}