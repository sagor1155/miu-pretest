public class Fancy {
    public static void main(String[] args) {
        System.out.println(isFancy(1));
        System.out.println(isFancy(5));
        System.out.println(isFancy(17));
        System.out.println(isFancy(10));
        System.out.println(isFancy(12));
    }

    public static int isFancy(int n) {
        if (n <= 0) return 0;
        int first = 1;
        int second = 1;

        while (second < n) {
            int temp = second;
            second = second*3 + first*2;
            first = temp;
        }
        if (second == n) return 1;
        return 0;
    }
}