import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {
        //Define two methods to print the maximum and the minimum number respectively
        // among three numbers entered by the user
        System.out.println("Find the Largest and Smallest among Three Numbers");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the A : ");
        int a= in.nextInt();
        System.out.print("Enter the B : ");
        int b= in.nextInt();
        System.out.print("Enter the C : ");
        int c= in.nextInt();
        int ans =max(a,b,c);
        System.out.println(ans);

    }
    public static int max(int f,int s,int t){
        int max=f;
        if (max<s){
            max=s;
        }
        if(max<t){
            max=t;
        }
        return max;
    }
}
