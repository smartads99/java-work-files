import java.util.Scanner;

public class java11 {
    public static void main(String[] args) {
      //Compound Interest Java Program
        /*
        Formula of Compound Interest
        interest = (principal * time * rate) / 100;
         */
        System.out.println("Compound Interest in Java");
        Scanner in =new Scanner(System.in);
        // take input from users
        System.out.print("Enter the principal: ");
        float principal = in.nextFloat();

        System.out.print("Enter the rate: ");
        float rate = in.nextFloat();

        System.out.print("Enter the time: ");
        float time = in.nextFloat();

        float interest = (principal * time * rate) / 100;

        System.out.println("Principal: " + principal);
        System.out.println("Interest Rate: " + rate);
        System.out.println("Time Duration: " + time);
        System.out.println("Simple Interest: " + interest);
    }
}
