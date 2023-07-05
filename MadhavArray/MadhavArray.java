
public class MadhavArray {
    public static void main(String[] args) {
        System.out.println(isMadhavArray(new int[]{2,1,1}));                            // 1
        System.out.println(isMadhavArray(new int[]{2,1,1,4,-1,-1}));                    // 1
        System.out.println(isMadhavArray(new int[]{6,2,4,2,2,2,1,5,0,0}));              // 1
        System.out.println(isMadhavArray(new int[]{18,9,10,6,6,6}));                    // 0
        System.out.println(isMadhavArray(new int[]{-6,-3,-3,8,-5,-4}));                 // 0
        System.out.println(isMadhavArray(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,-2,-1}));  // 1
        System.out.println(isMadhavArray(new int[]{3,1,2,3,0}));                        // 0
    }

    static int isMadhavArray(int[] a) {
        if (a.length < 3) return 0;
        int n = a[0];
        int len = 1;
        int startIndex = 0;
        for (int i=1; i<a.length; i++) {
            startIndex = startIndex + len; // 1:0+1, 3:1+2, 6:3+3, 10:6+4
            len = i + 1; // 2, 3, 4, 5

            if (startIndex==a.length) break;
            else if (startIndex+len > a.length) return 0;

            int sum = 0;
            for (int k=startIndex; k<startIndex+len; k++) {
                sum += a[k];
            }
            if (sum != n) return 0;
        }
        return 1;
    }

}