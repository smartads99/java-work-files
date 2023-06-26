public class ConcatenationofArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        getConcatenation(arr);
    }

    public static void getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2 * len];
        for (int i = 0; i < len; i++) {
            ans[i]=nums[i];
            ans[len + i]=nums[i];
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
