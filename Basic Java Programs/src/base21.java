import java.util.Scanner;

public class base21 {
    public static void main(String[] args) {
//        Fibonacci Series In Java Programs
        System.out.println("Fibonacci Series");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the N number:");
        int n=in.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while (count<=n)
        {
            int temp=b;
            System.out.print(b+" ");
            b=b+a;
            a=temp;
            count++;
        }
       System.out.println(b);
    }
}
