public class binaryseraceanddec {
    public static void main(String[] args) {
//        int[] arr = {1, 22, 33, 44, 55, 66, 77, 88, 99};
        int[] arr={99,78,66,56,44,33,23,22,1,4,-5};
        int search = -5;
        int ans=search(arr,search);
        System.out.println(ans);

    }

    static int search(int[] arr, int search) {
        int start = 0;
        int end = arr.length - 1;
//        boolean isorder;
//        if (arr[start] < arr[end]) {
//            isorder = true;
//        } else {
//            isorder = false;
//        }
        boolean isorder=arr[start]<arr[end];
        while (start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid]==search){
                return mid;
            }

            if (isorder) {
                if (search<arr[mid]){
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            } else {
                if (search>arr[mid]){
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}

