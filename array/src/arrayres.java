public class arrayres {
    public static void main(String[] args) {
        int [] arr={2,3,4,5,6,7,8,9,8};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
//        swap(arr,0,1);
        res(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    public static void res(int []arr,int start,int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int []arr,int a,int b){
        int temp=arr[a];
       arr[a]=arr[b];
       arr[b]=temp;
    }
}
