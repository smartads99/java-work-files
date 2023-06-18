import java.util.Scanner;

public class java13 {
    public static void main(String[] args) {
        //Sum Of N Numbers
        System.out.println("Sum Of N Numbers");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the N number : ");
        int n= in.nextInt();
        int sum=0;
        for (int i = 1; i <=n; i++) {
            System.out.print("Enter the number "+i+ " : ");
            int s= in.nextInt();
            sum=sum+s;
        }
        System.out.println("The sum of "+n+ " numbers is "+sum);
    }
}
