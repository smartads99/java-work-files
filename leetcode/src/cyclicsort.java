import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int []arr={3,1,3,4,2};
        missingnum(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void missingnum(int []arr){
        int i=0;
        while(i<arr.length){
            int cval=arr[i]-1;
            if(arr[i]!=arr[cval]){
                swap(arr,i,cval);
            }else
                i++;
        }
    }

    static void swap(int []arr,int first,int end){
        int temp=arr[first];
        arr[first]=arr[end];
        arr[end]=temp;
    }
}
