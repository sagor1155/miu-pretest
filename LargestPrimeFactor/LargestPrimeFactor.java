
public class LargestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
    }

    private static int largestPrimeFactor(int n) {
        if (n <= 1) return 0;

        int largest = -1;
        for (int i=2; i<=n/2; i++) {
            if (n%i == 0) {
                if (isPrime(i)==1 && i>largest) {
                    largest = i;
                }
            }
        }
        return largest;
    }

    private static int isPrime(int n) {
        if(n <= 1) return 0;
        for (int i=2; i<=n/2; i++) {
            if (n % i == 0) return 0;
        }
        return 1;
    }
}