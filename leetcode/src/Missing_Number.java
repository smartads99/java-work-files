import java.util.Arrays;

public class Missing_Number {
    public static void main(String[] args) {
        int []arr={3,0,1};
        missingnum(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(missnum(arr));

    }
    static void missingnum(int []arr){
        int i=0;
        while(i<arr.length){
            int cval=arr[i];
            if(arr[i]<arr.length &&arr[i]!=arr[cval]){
                swap(arr,i,cval);
            }else
                i++;
        }
    }
    static int missnum(int []arr){
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index) {
                return index;
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
