import java.util.Scanner;

public class tryoutjava7 {
    public static void main(String[] args) {
        //Fibonacci series
        int i,t1=0,t2=0;
        int next=t1+t2;
        System.out.print("Enter the Number ");
        Scanner input =new Scanner(System.in);
        int n= input.nextInt();
        System.out.println("Fibonacci Series " +t1+t2);
        for (i=3;i<=n;i++)
        {
            System.out.println(next);
            t1=t2;
            t2=next;
            next=t1+t2;
        }
    }
}
