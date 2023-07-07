import java.lang.reflect.Array;
import java.util.Arrays;

public class rotationcount {
    public static void main(String[] args) {
//        int[][] mat = {
//                {2, 3, 4},
//                {2, 3, 5},
//                {22, 33, 44}
//        };
//        System.out.println(Arrays.toString(search(mat,44)));

        int n=16;
        double ans=n;
        System.out.println(ans);
        double t=Math.sqrt(n);
        System.out.println(t);
    }
    static int[] search(int [][] arr,int element){
        int r=0;
        int c=arr.length-1;
        while(r< arr.length&& c>=0){
            if (arr[r][c]==element){
                return new int[]{r,c};
            }
            if(arr[r][c]<element){
                r++;
            } else {
                c--;
            }
        }
        return new int []{-1,-1};
    }

}
