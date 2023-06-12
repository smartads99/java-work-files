import java.util.Scanner;

public class tryoutjava7 {
    public static void main(String[] args) {
        //Fibonacci series
        System.out.println("Fibonacci series");
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=in.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while (count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            System.out.print(b+" ");
            count++;
        }
    }
}
