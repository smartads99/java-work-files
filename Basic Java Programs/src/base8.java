import java.util.Scanner;

public class base8 {
    public static void main(String[] args) {
//       Perimeter Of Circle

        /*
        Let us solve some interesting problems using the perimeter of circle formula.

Example 1: Using the perimeter of a circle formula, calculate the circumference of the circle with a diameter of 7 in (Use the value of π as 22/7)?
Solution:

To find: Perimeter of a circle

Given: Diameter of circle = 7 in

Using perimeter of a circle formula,

The perimeter of a circle = π D

Perimeter or circumference = 22/7 × 7

= 22 in

Answer: Perimeter of circle or circumference = 22 in.
         */

        System.out.println("Perimeter Of Circle");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Diameter of circle :");
        int d= in.nextInt();
        int ans=(22/7)*d;
        System.out.println("Perimeter of circle or circumference "+ ans +" in");
    }
}
