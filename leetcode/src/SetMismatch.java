import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
    int []arr={1,1};
    int []ans=findErrorNums(arr);
    System.out.println(Arrays.toString(ans));
    }
    static int[] findErrorNums(int[] nums) {
        sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return new int[]{i,i+1};
            }
        }
        return new int[]{-1,-1};
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
