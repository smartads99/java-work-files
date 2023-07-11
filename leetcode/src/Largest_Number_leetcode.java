import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Largest_Number_leetcode {
    public static void main(String[] args) {
        //https://leetcode.com/problems/largest-number/
        int []nums={10,2,22,5};
        largestNumber(nums);
        








    }
    static String [] res(int []nums){
        String []ans=new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=String.valueOf(nums[i]);
        }
        return ans;
    }
    static void largestNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for (int j = 1; j <nums.length; j++) {
                if (nums[j] < nums[j-1]) {
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }

    }
}
