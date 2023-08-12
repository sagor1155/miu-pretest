
public class DigitIncreasing {

    public static void main(String[] args) {
        System.out.println(isDigitIncreasing(7));
        System.out.println(isDigitIncreasing(24));
        System.out.println(isDigitIncreasing(36));
        System.out.println(isDigitIncreasing(984));
        System.out.println(isDigitIncreasing(7404));
        System.out.println(isDigitIncreasing(7403));
    }

    static int isDigitIncreasing(int n) {
        for (int i=1; i<10; i++) {
            int sum = i, digits = i;
            while (sum < n) {
                digits = digits * 10 + i;
                sum += digits;
            }
            if (sum == n) return 1;
        }
        return 0;
    }

}