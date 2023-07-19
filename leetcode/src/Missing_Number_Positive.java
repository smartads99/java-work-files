import java.util.Arrays;

public class Missing_Number_Positive {
    public static void main(String[] args) {
        int []arr={7,8,9,11,12};
        missingnum(arr);
        System.out.println(Arrays.toString(arr));
        int ans=missnum(arr);
        System.out.println(ans);
    }
    static void missingnum(int []arr){
        int i=0;
        while(i<arr.length){
            int cval=arr[i]-1;
            if(0 < cval &&arr[i]!=arr[cval]){
                swap(arr,i,cval);
            }else
                i++;
        }
    }
    static int missnum(int []arr){
        for (int index = 0; index < arr.length; index++) {
            if( arr[index]>0 && arr[index]!=index+1) {
                return index+1;
            }
        }
        return arr.length;
    }
    static void swap(int []arr,int first,int end){
        int temp=arr[first];
        arr[first]=arr[end];
        arr[end]=temp;
    }
}
