
public class CubePowerfull {
    public static void main(String[] args) {
        System.out.println(isCubePowerfull(153));
        System.out.println(isCubePowerfull(370));
        System.out.println(isCubePowerfull(371));
        System.out.println(isCubePowerfull(407));
        System.out.println(isCubePowerfull(87));
        System.out.println(isCubePowerfull(0));
        System.out.println(isCubePowerfull(-81));
    }

    static int isCubePowerfull(int n) {
        if (n <= 0) return 0;
        int num = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            n /= 10;

            int cube = 1;
            for (int i=0; i<3; i++) {
                cube *= digit;
            }

            sum += cube;
        }
        return sum == num ? 1 : 0;
    }
}