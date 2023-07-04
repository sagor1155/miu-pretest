public class Square {
    public static void main(String[] args) {
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));
    }

    public static int isSquare(int number) {
        if (number < 0) return 0;
        for (int i=0; i<=number/2; i++) {
            if (i*i == number) return 1;
        }
        return 0;
    }
}