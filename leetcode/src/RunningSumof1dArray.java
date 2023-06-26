public class RunningSumof1dArray {
    // 1480.Running Sum of 1d Array
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        runningSum(arr);

    }
    public static void  runningSum(int[] nums) {
       //runningSum[i] = sum(nums[0]…nums[i])
//        for (int i = 1; i < nums.length; i++) {
//            for (int j = i; j < i+1; j++) {
//                nums[i]=nums[i]+nums[j];
//            }
//        }
        for(int i=1;i<nums.length;i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+ " ");
        }
    }
}
