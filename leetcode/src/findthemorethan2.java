import org.w3c.dom.ls.LSOutput;

public class findthemorethan2 {
    public static void main(String[] args) {
        int []nums={2,2,1,1,1,2,2};
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int f=i;f<nums.length;f++){
                if(nums[i]==nums[f]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

//    public static int majorityElement(int[] nums) {
//        int count=0;
//        for(int i=0;i<nums.length;i++){
//            for(int f=i;f<nums.length;f++){
//                if(nums[i]==nums[f]){
//                    count++;
//                }
//            }
//        }
//
//    }
}
