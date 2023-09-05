import java.util.ArrayList;
import java.util.Scanner;

public class java_list {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []list1=new int[n];
        for (int i = 0; i < n; i++) {
            list1[i]=in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(list1[i]+" ");

        }

    }
}
