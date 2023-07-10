public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(reverse(1234));
        System.out.println(reverse(12005));
        System.out.println(reverse(1));
        System.out.println(reverse(1000));
        System.out.println(reverse(0));
        System.out.println(reverse(-12345));
    }

    public static int reverse(int number) {
        int sign = 1;
        if (number < 0) {
            sign = -1;
            number = sign * number;
        }

        int rev = 0;
        while (number > 0) {
            int rem = number % 10;
            rev = rev * 10 + rem;
            number /= 10;
        }
        return rev * sign;
    }
}