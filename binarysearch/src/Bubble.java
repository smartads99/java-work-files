import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int []a={7,5,4,6,3,2};
       bubblesort(a);
        System.out.println(Arrays.toString(a));

    }
    public static void bubblesort(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
