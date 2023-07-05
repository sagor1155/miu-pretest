import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        System.out.println(f(new char[] {'a','b','c'}, 0, 4));
        System.out.println(f(new char[] {'a','b','c'}, 0, 3));
        System.out.println(f(new char[] {'a','b','c'}, 0, 2));
        System.out.println(f(new char[] {'a','b','c'}, 0, 1));

        System.out.println(f(new char[] {'a','b','c'}, 1, 3));
        System.out.println(f(new char[] {'a','b','c'}, 1, 2));
        System.out.println(f(new char[] {'a','b','c'}, 1, 1));

        System.out.println(f(new char[] {'a','b','c'}, 2, 2));
        System.out.println(f(new char[] {'a','b','c'}, 2, 1));
        System.out.println(f(new char[] {'a','b','c'}, 3, 1));
        System.out.println(f(new char[] {'a','b','c'}, 1, 0));

        System.out.println(f(new char[] {'a','b','c'}, -1, 2));
        System.out.println(f(new char[] {'a','b','c'}, -1, -2));
        System.out.println(f(new char[] {}, 0, 1));
    }

    public static String f(char[] chars, int start, int len) {
        if (chars.length==0 || len<0 || start<0 || start+len>chars.length) {
            return null;
        }
        if (len==0) return Arrays.toString(new char[]{});

        char[] newArr = new char[len];
        for (int i=start; i<start+len; i++) {
            newArr[i-start] = chars[i];
        }
        return Arrays.toString(newArr);
    }
}