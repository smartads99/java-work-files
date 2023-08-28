import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        int[] arr = {2,4, 5,9,20,45,76};
        int[] morenum={6,3,4,5,6,6,7,6};
        boolean ans = isSorted(arr);
        System.out.println(ans);
        //with recursion
        System.out.println(sorted(arr,0));
       findallindex(morenum,6,0);
        System.out.println(list);
    }

    static ArrayList<Integer> list=new ArrayList<>();
    public static void findallindex(int[]arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
           list.add(index);
        }
        findallindex(arr,target,index+1);
    }
    public static boolean isSorted(int [] arr){
        int chk=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[chk]<=arr[i]){
                chk++;
            }else{
                return false;
            }
        }
        return true;
    }
    public static boolean sorted(int []arr,int index){
        //base con
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}
