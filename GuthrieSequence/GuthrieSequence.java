public class GuthrieSequence {

    public static void main(String[] args) {
        System.out.println(isGuthrie(new int[]{8,4,2,1})); // 1
        System.out.println(isGuthrie(new int[]{8,17,4,1})); // 0
        System.out.println(isGuthrie(new int[]{8,4,1})); // 0
        System.out.println(isGuthrie(new int[]{8,4,2})); // 0
        System.out.println(isGuthrie(new int[]{16,8,4,2,1})); // 1
        System.out.println(isGuthrie(new int[]{16,8,4,2,1,1})); // 0
        System.out.println(isGuthrie(new int[]{7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1})); // 1
    }

    static int isGuthrie(int[] a) {
        if (a.length<2 || a[a.length-1] != 1) return 0;

        int num = a[0];
        int idx = 0;
        while (num != 1) {
            if (num%2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            idx++;

            if (idx >= a.length || a[idx] != num) return 0;
        }

        return (a.length != idx+1) ? 0 : 1;
    }
}