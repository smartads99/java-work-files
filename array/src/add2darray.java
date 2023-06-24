import java.util.Scanner;

public class add2darray {
    public static void main(String[] args) {
        int[][] arr1 =new int [3][3];
        Scanner in=new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                arr1[i][j]=in.nextInt();
            }
        }
        int [][] arr2=new int[3][3];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                arr2[i][j]=in.nextInt();
            }
        }
        System.out.println("A:");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("B:");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        int [][] ans=new int[3][3];
        System.out.println("ans");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                ans[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }



    }
}
