import java.util.Arrays;

public class CommonElm {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(commonElem(new int[]{1,8,3,2}, new int[]{4,2,6,1})));
        System.out.println(Arrays.toString(commonElem(new int[]{1,8,3,2,6}, new int[]{2,6,1})));
        System.out.println(Arrays.toString(commonElem(new int[]{1,3,7,9}, new int[]{7,1,9,3})));
        System.out.println(Arrays.toString(commonElem(new int[]{1,2}, new int[]{3,4})));
        System.out.println(Arrays.toString(commonElem(new int[]{}, new int[]{1,2,3})));
        System.out.println(Arrays.toString(commonElem(new int[]{1,2}, null)));
    }

    public static int[] commonElem(int[] first, int[] second) {
        if (first == null || second == null) return null;
        if (first.length == 0 || second.length == 0) return new int[]{};

        // find small array length
        int smallLen = 0;
        if(first.length <= second.length) {
            smallLen = first.length;
        } else {
            smallLen = second.length;
        }

        // find common array
        int[] commonArray = new int[smallLen];
        int idx = 0;
        for (int i=0; i<first.length; i++) {
            for (int k=0; k<second.length; k++) {
                if (first[i] == second[k]) {
                    commonArray[idx++] = first[i];
                    break;
                }
            }
        }

        // discard extra data/len
        int[] result = new int[idx];
        for (int i=0; i<idx; i++) {
            result[i] = commonArray[i];
        }

        return result;
    }

}