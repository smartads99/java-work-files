import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class missing_all_number {
    public static void main(String[] args) {
        int []arr={4,3,2,7,8,2,3,1};
        sort(arr);
        List<Integer>ans=new ArrayList<Integer>(arr.length);
        ans=findthenum(arr);
        for (int i :ans) {
            System.out.print(i+" ");
        }

    }

    static List<Integer> findthenum(int[] arr){
        List<Integer>ans=new ArrayList<Integer>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1){
                ans.add(i);
            }
        }
        return ans;
    }
    static void sort(int[] arr){
        int i=0;
        while(i< arr.length){
            int cval=arr[i]-1;
            if(cval<=arr.length-1 && arr[i]!=arr[cval]) {
                swap(arr, i, cval);
            }else {
                i++;
            }
        }
    }
    static void swap (int []arr,int first,int end){
        int temp=arr[first];
        arr[first]=arr[end];
        arr[end]=temp;
    }
}
