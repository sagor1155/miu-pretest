import java.util.Arrays;

public class EncodeNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeNumber(2)));
        System.out.println(Arrays.toString(encodeNumber(6)));
        System.out.println(Arrays.toString(encodeNumber(14)));
        System.out.println(Arrays.toString(encodeNumber(24)));
        System.out.println(Arrays.toString(encodeNumber(1200)));
        System.out.println(Arrays.toString(encodeNumber(1)));
        System.out.println(Arrays.toString(encodeNumber(-18)));
    }

    private static int[] encodeNumber(int num) {
        if(num <= 1) return null;
        int n = num;
        int len = 0;
        for (int i=2; i<=n; i++) {
            while (n%i==0) {
                n /= i;
                len++;
            }
        }

        int[] factors = new int[len];
        int idx = 0;
        n = num;
        for (int i=2; i<=n; i++) {
            while (n%i==0) {
                n /= i;
                factors[idx++] = i;
            }
        }
        return factors;
    }

}