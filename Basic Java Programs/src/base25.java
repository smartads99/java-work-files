import java.util.Scanner;

public class base25 {
    public static void main(String[] args) {
//        Take integer inputs till the user enters 0 and print the largest number from all.
        System.out.println("Take integer inputs till the user enters 0 and print the largest number from all.");
        Scanner in = new Scanner(System.in);
        int lag = 0;
        while (true) {
            System.out.print("Enter the number :");
            int num = in.nextInt();
            if (num == 0) {
                break;
            }

            if (num > lag) {
                lag = num;
            }
        }
        System.out.println("The Largest number is " + lag);
//        if (lag == 0) {
//            System.out.println("No numbers were entered.");
//        } else {
//            System.out.println("The largest number is: " + lag);
//        }
    }
//

    }
