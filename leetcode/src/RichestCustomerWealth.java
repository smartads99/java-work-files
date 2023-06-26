import java.util.Arrays;
import java.util.Scanner;

public class RichestCustomerWealth {
    //1672. Richest Customer Wealth
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //for input
        int n= in.nextInt();
        int m=in.nextInt();
        int arr[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]= in.nextInt();
            }
        }

        //for print
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        //for sum
        int max=0;
        int sum=0;
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n ; j++) {
                sum=sum+arr[i][j];
            }
            if(max<sum) {
                max = sum;
            }
            sum=0;
        }
        System.out.println("the max ="+max);
        }
    }



