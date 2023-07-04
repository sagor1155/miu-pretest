public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(isFibonacci(5));
        System.out.println(isFibonacci(6));
        System.out.println(isFibonacci(8));
    }

    public static int isFibonacci(int n) {
        if (n <= 0) return 0;
        int first = 1;
        int second = 1;

        while (second < n) {
            int temp = second;
            second = first + second;
            first = temp;
        }
        if (second == n) return 1;
        return 0;
    }
}