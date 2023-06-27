import java.util.ArrayList;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    //1365. How Many Numbers Are Smaller Than the Current Number
    public static void main(String[] args) {
        int count=0;
        int arr[]={8,1,2,2,3};
        int len= arr.length;
        int []ans=new int[len];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < args.length; j++) {
                if (i!=j){
                    if(arr[i]>arr[j]){
                        count=count+1;
                    }
                }
            }
            ans[i]=count;
            count=0;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
