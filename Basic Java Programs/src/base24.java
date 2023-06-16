import java.util.Scanner;

public class base24 {
    public static void main(String[] args) {
//        Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        System.out.println("Take integer inputs till the user enters 0 and print the sum of all numbers");
        System.out.print("Enter the number :");
        Scanner in =new Scanner(System.in);
        int n=1;
        int sum=0;
        while (n!=0){
            n =in.nextInt();
            sum=sum+n;
        }
        System.out.println("The Sum of all given Numbers is "+sum);
    }
}
