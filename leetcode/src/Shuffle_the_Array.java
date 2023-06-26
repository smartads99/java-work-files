public class Shuffle_the_Array {
    //1470. Shuffle the Array
    public static void main(String[] args) {
        int [] nums={2,5,1,3,4,7};
        int n=3;
        int e=n-1;
        int [] ans=new int[2*n];
        int count=0;
//        for (int i=0;i<n;i++){
//            ans[count]=nums[i];
//            ans[e]=nums[e];
//            count++;
//            e++;
//        }
        for(int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[(2 * i )+ 1] = nums[i + n];
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+ " ");
        }
    }
}
