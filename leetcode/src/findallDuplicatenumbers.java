import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findallDuplicatenumbers {
    //https://leetcode.com/problems/find-the-duplicate-number/
    public static void main(String[] args) {
        int []arr={4,3,2,7,8,2,3,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer>ans=new ArrayList<Integer>(arr.length);
        ans=findDuplicates(arr);
        for (int i :ans) {
            System.out.print(i+" ");
        }

    }
    public static List<Integer> findDuplicates(int[] nums) {
        sort(nums);
        List<Integer>ans=new ArrayList<>(nums.length);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
    static void sort(int[]arr){
        int i=0;
        while(i<arr.length){
            int cval=arr[i]-1;
            if(cval< arr.length&& arr[i]!=arr[cval]){
                swap(arr,i,cval);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int end){
        int temp=arr[first];
        arr[first]=arr[end];
        arr[end]=temp;
    }
}

