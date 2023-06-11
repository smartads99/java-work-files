import java.sql.SQLOutput;
import java.util.Scanner;

public class tryoutjava1 {
    public static void main(String[] args) {
//        Write a program to print whether a number is even or odd, also take input from the user.
//        int a=1;
//        if (a%2==0)
//        {
//            System.out.println("The "+ a +" is Even Number");
//        }
//        else {
//            System.out.println("The " + a + " is Odd Number");
//        }

        //program with user input
        System.out.print("Enter the Number : ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        if (num%2==0)
        {
            System.out.println("The "+num+" is Even Number");
        }else {
            System.out.println("The "+num+" is Odd Number");
        }
    }
}
