import java.util.Arrays;

public class findtheDuplicateNumber {
    public static void main(String[] args) {
        int []arr={3,1,3,4,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findDuplicate(arr));
    }
    public static  int findDuplicate(int[] nums) {
        sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return nums[i];
            }
        }
        return -1;
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
