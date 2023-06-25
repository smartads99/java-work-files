import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int [] arr={2,3,4,5,6};
//        arr[0]=1;
//        arr[1]=12;
//        arr[2]=3;
//        arr[3]=55;
//        arr[4]=7;
        Scanner in=new Scanner(System.in);
        System.out.println("Swap");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        swap(arr,0,1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }

    }


    public static void swap (int[]arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}
