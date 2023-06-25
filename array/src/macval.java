public class macval {
    public static void main(String[] args) {
        int [] arr={22,55,66,5,34,23};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        int ans =max(arr,1,5);
        System.out.println(ans);


    }
    public static int max(int []arr,int start,int end){
        int max=arr[0];
        for (int i = start; i <=end ; i++) {
            if(max<arr[i]){
                max=arr[i];
        }
        }
        return max;
    }
}
