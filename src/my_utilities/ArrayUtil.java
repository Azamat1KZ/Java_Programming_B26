package my_utilities;

public class ArrayUtil {
    public static int indexOf(String[] strs, String element) {
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(int[] nums, int element) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                return i;
            }
        }
        return -1;
    }
}