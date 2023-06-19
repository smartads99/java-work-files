import java.util.Scanner;

public class java23 {
    public static void main(String[] args) {
        //Sum Of A Digits Of Number
        System.out.println("Sum Of n Digits Of Number");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= in.nextInt();
        int s=n;
        int sum=0;
        for (int i = 0; i <n; i++) {
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("Sum Of "+ s+" is "+sum);
    }
}
