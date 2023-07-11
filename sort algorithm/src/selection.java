import java.lang.reflect.Array;
import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int []arr={4,5,1,2,3};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));

    }

     static void selectionsort(int []arr){
         for (int i = 0; i < arr.length; i++) {
             int last = arr.length-i-1;
             int max=getmaxindex(arr,0,last);
             swap(arr,max,last);
         }
     }

     static void swap(int []arr,int max,int last) {
        int temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }

    static int getmaxindex(int []arr, int start,int last) {
        int max=start;
         for (int i = 0; i <=last; i++) {
             if(arr[max]<arr[i]){
                 max=i;
             }
         }
         return max;
    }
}
