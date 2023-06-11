import java.util.Scanner;

public class tryoutjava3 {
    public static void main(String[] args) {
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest

//        Solved Examples Using Simple Interest Formula
//        Example 1: What is the simple interest on the principal amount of $12000 in 2 years, if the interest rate is 12%?
//                Solution:
//
//                To find: Simple Interest after 2 years.
//
//                Principle amount = $12000, r = 12%, t = 2(given)
//
//                Using the simple interest formula,
//
//                SI = (P × R ×T)/100
//
//        SI = (12000× 12 × 2)/100
//
//        SI = $2880
        System.out.println("Simple Interest Program");
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the Principal Amount (P) Rs: ");
        int p=input.nextInt();
        System.out.print("Enter the Year (T):");
        int t= input.nextInt();
        System.out.print("Enter the Rate (R):");
        int r= input.nextInt();

        int si=((p*r*t)/100);
        System.out.println("Interest Amount is Rs:"+si);
        System.out.println("Principal Amount is Rs:"+p);
        System.out.println("Total Value Rs:"+(si+p));
    }
}
