// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class binarysearch {
    public static void main(String[] args) {
        int[] array = {1, 22, 33, 45, 47, 55, 65, 67, 89, 90};
        int search=1;
        int ans = binarys(array,search);
        System.out.println(ans);

    }
    static int binarys(int []arr,int search){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if (search<arr[mid]){
                end=mid-1;
            } else if (search>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}