public class ConcatenatedSum {
    public static void main(String[] args) {
        System.out.println(isConcatenatedSum(198, 2));
        System.out.println(isConcatenatedSum(198, 3));
        System.out.println(isConcatenatedSum(2997, 3));
        System.out.println(isConcatenatedSum(2997, 2));
        System.out.println(isConcatenatedSum(13332, 4));
        System.out.println(isConcatenatedSum(9, 1));

    }

    public static int isConcatenatedSum(int n, int catlen) {
        int num = n, sum = 0;

        while(n > 0) {
            int digit = n % 10;
            n /= 10;
            int concat = 0;
            for (int i=0; i<catlen; i++) {
                concat = concat * 10 + digit;
            }
            sum += concat;
        }

        return sum == num ? 1 : 0;
    }
}