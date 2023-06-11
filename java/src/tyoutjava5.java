import java.util.Scanner;

public class tyoutjava5 {
    public static void main(String[] args) {
//        take 2 numbers as input and print the largest number.
        System.out.println("Find the Largest number");
//        Scanner input =new Scanner(System.in);
//        System.out.print("Enter the First Number :");
//        int a= input.nextInt();
//        System.out.print("Enter the Second Number :");
//        int b= input.nextInt();
//        if (a<=b)
//        {
//            System.out.println("The Largest Number is Second number "+b);
//        }
//        else {
//            System.out.println("The Largest Number is First number"+a);
//
//        }

        System.out.println("Find the Largest number with 3 numbers");
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the 1 Number :");
        int a= input.nextInt();
        System.out.print("Enter the 2 Number :");
        int b= input.nextInt();
        System.out.print("Enter the 3 Number :");
        int c= input.nextInt();
        if(a>=b && a>=c)
        {
            System.out.println("The Largest Number is 1 "+a);
        } else if (b>=a && b>=c) {
            System.out.println("The Largest Number is 2 "+b);
        }else
        {
            System.out.println("The Largest Number is 3 "+c);
        }
    }
}
